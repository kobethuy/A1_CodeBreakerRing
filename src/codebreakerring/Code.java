package codebreakerring;

import java.util.ArrayList;
import java.util.Collections;

public class Code {
	
	private ArrayList<Marble> marbles = new ArrayList<Marble>();
	private ArrayList<Integer> seed = new ArrayList<Integer>();
	
	public Code() {
		init();
	}

	public ArrayList<Marble> getMarbles() {
		return this.marbles;
	}

	public void setMarbles(ArrayList<Marble> marbles) {
		this.marbles = marbles;
	}
	
	public void init() {
		for (int a = 0; a < 8; a++)
			seed.add(new Integer(a));
		
		Collections.shuffle(seed);
		
		for (int b = 0; b < 6; b++)
			marbles.add(new Marble(seed.get(b).intValue(), b));
	}
	
	public void clear() {
		marbles.clear();
		seed.clear();
	}
	
	public int hint(int color_code, int position) {
		if (color_code == getMarbles().get(position).getColor_code() && 
			position == getMarbles().get(position).getPosition()) {
			return 1;
		} else {
			for (int a = 0; a < getMarbles().size(); a++) {
				if (color_code == getMarbles().get(a).getColor_code() &&
					position != getMarbles().get(a).getPosition()) {
					return 0;
				}
			}
		}
		return -1;
	}
}
