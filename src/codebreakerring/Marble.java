package codebreakerring;

import javax.swing.JLabel;

public class Marble {
	
	private int color_code, position;
	private JLabel label;
	private boolean label_state = false;
	private String[] color_list = {	"red", 
									"orange", 
									"yellow",
									"green", 
									"cyan",
									"blue", 
									"magnenta",
									"pink"};
	
	public Marble(int color_code, int position) {
		this.color_code = color_code;
		this.position = position;
	}

	public int getColor_code() {
		return this.color_code;
	}

	public int getPosition() {
		return this.position;
	}

	public String[] getColor_list() {
		return this.color_list;
	}
	
	public JLabel getLabel() {
		return this.label;
	}

	public boolean isLabel_state() {
		return this.label_state;
	}

	public void setLabel_state(boolean label_state) {
		this.label_state = label_state;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public void setColor_code(int color_code) {
		this.color_code = color_code;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public void setColor_list(String[] color_list) {
		this.color_list = color_list;
	}
	
}
