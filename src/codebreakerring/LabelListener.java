package codebreakerring;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LabelListener extends MouseAdapter {
	
	private JLabel label;
	private JLabel[] labels;
	private int pos_org, pos_dest;
	private String[] color_code;
	private Integer icon_set;
	private Code code;
	
	public LabelListener(JLabel label, int pos_org, JLabel[] labels, String[] color_code, Integer icon_set, int pos_dest, Code code){
		this.label = label;
		this.pos_org = pos_org;
		this.pos_dest = pos_dest;
		this.labels = labels;
		this.color_code = color_code;
		this.icon_set = icon_set;
		this.code = code;
	}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		this.labels[pos_dest].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/" 
																					+ this.color_code[pos_org] 
																					+ "_" 
																					+ this.icon_set.toString() 
																					+ ".png")));
		
		this.label.setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/hole.png")));
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		this.labels[pos_dest].setIcon(this.code.getMarbles().get(pos_dest).getLabel().getIcon());
		this.label.setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/" 
																		+ this.color_code[pos_org] 
																		+ "_" 
																		+ this.icon_set.toString() 
																		+ ".png")));
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		this.code.getMarbles().get(pos_dest).setColor_code(pos_org);
		this.code.getMarbles().get(pos_dest).getLabel().setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/" 
																					+ this.color_code[pos_org] 
																					+ "_" 
																					+ this.icon_set.toString() 
																					+ ".png")));
	}

}
