package codebreakerring;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;

public class MarbleChoiceListener extends MouseAdapter {
	
	private int pos_org;
	
	public MarbleChoiceListener(int pos_org){
		this.pos_org = pos_org;
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		CodeBreakerGUI.getCode().getMarbles().get(CodeBreakerGUI.getPos()).getLabel().setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/" 
																															+ CodeBreakerGUI.getColor_list()[pos_org] 
																															+ "_" 
																															+ CodeBreakerGUI.getIcon_set().toString() 
																															+ ".png")));
	}
}
