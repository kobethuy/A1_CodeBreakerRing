package codebreakerring;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LabelListener extends MouseAdapter {
	
	private int pos_org;
	private String[] color_code;
	private Integer icon_set;
	private Code code;
	
	public LabelListener(int pos_org, String[] color_code, Integer icon_set, Code code){
		this.pos_org = pos_org;
		this.color_code = color_code;
		this.icon_set = icon_set;
		this.code = code;
	}
	
	/* Buggy as fck
	@Override
	public void mouseEntered(MouseEvent arg0) {
		this.labels[CodeBreakerGUI.getPos()].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/" 
																								  + this.color_code[pos_org] 
																								  + "_" 
																								  + this.icon_set.toString() 
																								  + ".png")));
		
		this.label.setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/hole.png")));
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
		if (this.code.getMarbles().get(CodeBreakerGUI.getPos()).isLabel_state()) {
			this.labels[CodeBreakerGUI.getPos()].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/" 
																										+ this.code.getMarbles().get(CodeBreakerGUI.getPos()).getColor_list()[this.code.getMarbles().get(CodeBreakerGUI.getPos()).getColor_code()]
																										+ "_"
																										+ this.icon_set
																										+ ".png")));
		} else {
			this.labels[CodeBreakerGUI.getPos()].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/hole.png")));
		}
		
		this.label.setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/" 
																		+ this.color_code[pos_org] 
																		+ "_" 
																		+ this.icon_set.toString()
																		+ "_shadow.png")));
	}
	*/
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		//this.code.getMarbles().get(CodeBreakerGUI.getPos()).setColor_code(pos_org);
		//this.code.getMarbles().get(CodeBreakerGUI.getPos()).setLabel_state(true);
		this.code.getMarbles().get(CodeBreakerGUI.getPos()).getLabel().setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/" 
																															+ this.color_code[pos_org] 
																															+ "_" 
																															+ this.icon_set.toString() 
																															+ ".png")));
	}
}
