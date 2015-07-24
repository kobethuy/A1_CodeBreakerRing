package codebreakerring;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LabelListener extends MouseAdapter {
	
	private JLabel label;
	private int pos;
	
	public LabelListener(JLabel label){
		this.label = label;
	}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		//labels[0].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/pink_0.png")));
		this.label.setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/hole.png")));
	}

	@Override
	public void mouseExited(MouseEvent arog0) {
		//labels[0].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/hole.png")));
		this.label.setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/pink_0.png")));
	}

}
