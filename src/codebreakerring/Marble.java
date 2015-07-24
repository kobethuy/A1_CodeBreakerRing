package codebreakerring;

import javax.swing.JLabel;

public class Marble {
	
	private int color_code, position;
	private String color_name;
	private JLabel label;
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

	public String getColor_name() {
		return this.color_name;
	}

	public String[] getColor_list() {
		return this.color_list;
	}
	
	public JLabel getLabel() {
		return this.label;
	}

	public void setColor_code(int color_code) {
		this.color_code = color_code;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public void setColor_name(String color_name) {
		this.color_name = color_name;
	}

	public void setColor_list(String[] color_list) {
		this.color_list = color_list;
	}
	
	public void setLabel(JLabel label) {
		this.label = label;
	}
}
