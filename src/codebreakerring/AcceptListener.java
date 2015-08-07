package codebreakerring;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AcceptListener extends MouseAdapter {
	
	private String[] ans = {"1", "1", "1", "1", "1", "1"};
	private int[] hint = {-1, -1, -1, -1, -1, -1};
	private int[] dummy = {-1, -1, -1, -1, -1, -1};
	private int a = 0;
	private JLabel[] labels;
	private JButton acceptButton, giveUpButton;
	private JPanel game_container;
	
	public AcceptListener(JLabel[] labels, JButton acceptButton, JButton giveUpButton, JPanel game_container) {
		this.labels = labels;
		this.acceptButton = acceptButton;
		this.giveUpButton = giveUpButton;
		this.game_container = game_container;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		// Debug
		for (a = 0; a < 6; a++)
	   		System.out.println(CodeBreakerGUI.getCode().getMarbles().get(a).getColor_list()[CodeBreakerGUI.getCode().getMarbles().get(a).getColor_code()]);
		
		if (!acceptButton.isEnabled())
			return;
		
		if (!Timer.getStart()) {
			CodeBreakerMain.getTimer().start();
		}
		
		CodeBreakerGUI.setMove(CodeBreakerGUI.getMove() + 1);
		
		CodeBreakerGUI.getLblMove().setText("Move: " + CodeBreakerGUI.getMove());
		
		ans[CodeBreakerGUI.getPos()] = getFileName(labels[CodeBreakerGUI.getPos()].getIcon().toString());

		System.out.println(getFileName(labels[CodeBreakerGUI.getPos()].getIcon().toString()));

		if (checkWin()) {
			CodeBreakerGUI.gameWin(game_container, acceptButton, giveUpButton);
		}

		dummy[CodeBreakerGUI.getPos()] = CodeBreakerGUI.getCode().hint(getColorCode(getFileName(labels[CodeBreakerGUI.getPos()].getIcon().toString())), CodeBreakerGUI.getPos());

		for (a = 0; a < 6; a++)
			hint[a] = dummy[a];
		Arrays.sort(hint);

		for (a = 11; a > 5; a--) {
			System.out.print(hint[Math.abs(a - 11)]);
			if (hint[Math.abs(a - 11)] == 0) {
				labels[a].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/white_hint.png")));
			} else if (hint[Math.abs(a - 11)] == 1) {
				labels[a].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/black_hint.png")));
			}
		}
		
		if (CodeBreakerGUI.getPos() != 5) {
			CodeBreakerGUI.setPos(CodeBreakerGUI.getPos() + 1);
		} else {
			CodeBreakerGUI.setPos(0);
		}

		for (a = 0; a < 6; a++) {
			labels[a + 20].setIcon(null);
			labels[a + 20].revalidate();
		}

		labels[CodeBreakerGUI.getPos() + 20].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/ring.png")));	   			
	}
	
	public String getFileName(String path) {
		StringBuilder substring, filename;
		substring = new StringBuilder();
		filename = new StringBuilder();
		int index = path.length() - 1;
		while (path.charAt(index) != '/') {
			substring.append(path.charAt(index));
			index--;
		}
		index = 0;
		String name = substring.reverse().toString();
		while (name.charAt(index) != '_') {
			
			if (name.contains("hole"))
				return "null";
			
			filename.append(name.charAt(index));
			index++;
		}
		return filename.toString();
	}
	
	public boolean checkWin() {
		
		for (a = 0; a < 6; a++) {
			System.out.println(ans[a] + "_" + CodeBreakerGUI.getCode().getMarbles().get(a).getColor_list()[CodeBreakerGUI.getCode().getMarbles().get(a).getColor_code()]);
			if (!ans[a].equalsIgnoreCase(CodeBreakerGUI.getCode().getMarbles().get(a).getColor_list()[CodeBreakerGUI.getCode().getMarbles().get(a).getColor_code()])) {
				return false;
			}
		}
		return true;
	}
	
	public int getColorCode(String color) {
		for (a = 0; a < 8; a++) {
			if (CodeBreakerGUI.getColor_list()[a].equalsIgnoreCase(color))
				return a;
		}
		return 10;
	}

}
