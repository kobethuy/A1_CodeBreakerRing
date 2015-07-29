package codebreakerring;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class CodeBreakerGUI {

	private JFrame frmCodeBreakerRing;
	
	private static Code code;
	
	private JPanel  game_container,
					panel,
					panel_marble_0,
					panel_marble_1,
					panel_marble_2,
					panel_marble_stat_container,
					marble_0_stat_panel,
					marble_1_stat_panel,
					marble_2_stat_panel,
					marble_3_stat_panel,
					marble_4_stat_panel,
					marble_5_stat_panel,
					panel_1,
					panel_2,
					panel_3,
					panel_5,
					panel_6,
					panel_7;
	
	private JLabel  marble_0,
				   	marble_1,
				   	marble_2,
				   	marble_3,
				   	marble_4,
				   	marble_5,
				   	marble_0_stat,
				   	marble_1_stat,
				   	marble_2_stat,
				   	marble_3_stat,
				   	marble_4_stat,
				   	marble_5_stat,
				   	marbleColor0,
				   	marbleColor1,
				   	marbleColor2,
				   	marbleColor3,
				   	marbleColor4,
				   	marbleColor5,
				   	marbleColor6,
				   	marbleColor7,
				   	ring_0,
				   	ring_1,
				   	ring_2,
				   	ring_3,
				   	ring_4,
				   	ring_5;
	
	private String[] color_list = {	"red", 
									"orange", 
									"yellow",
									"green", 
									"cyan",
									"blue", 
									"magnenta",
									"pink"};
	
	private int a;
	
	private static int pos = 0;
	
	private String[] ans = {"1",
							"1",
							"1",
							"1",
							"1",
							"1"};
	
	private int[] hint = {-1, -1, -1, -1, -1, -1};
	private int[] dummy = {-1, -1, -1, -1, -1, -1};
	
	private Integer icon_set = 0;

	private JButton quitButton,
					btnNewGame,
					acceptButton,
					timerButton,
					giveUpButton;

	private JTextArea scoreBoard;

	private JScrollPane scrollPane;

	private JMenuBar menuBar;

	private JMenu mnFile;

	private JMenuItem mntmOptions,
					  mntmAbout;

	private FlowLayout flowLayout;
	
	public JFrame getFrmCodeBreakerRing() {
		return this.frmCodeBreakerRing;
	}
	
	/**
	 * Create the application.
	 */
	public CodeBreakerGUI() {
		frmCodeBreakerRing = new JFrame();
		game_container = new JPanel();
		panel = new JPanel();
		panel_1 = new JPanel();
		panel_2 = new JPanel();
		panel_3 = new JPanel();
		panel_5 = new JPanel();
		panel_6 = new JPanel();
		panel_7 = new JPanel();
		marble_0_stat_panel = new JPanel();
		marble_1_stat_panel = new JPanel();
		marble_2_stat_panel = new JPanel();
		marble_3_stat_panel = new JPanel();
		marble_4_stat_panel = new JPanel();
		marble_5_stat_panel = new JPanel();
		panel_marble_stat_container = new JPanel();
		panel_marble_0 = new JPanel();
		panel_marble_1 = new JPanel();
		panel_marble_2 = new JPanel();
		marble_0 = new JLabel();
		marble_1 = new JLabel();
	   	marble_2 = new JLabel();
	   	marble_3 = new JLabel();
	   	marble_4 = new JLabel();
	   	marble_5 = new JLabel();
	   	ring_0 = new JLabel();
	   	ring_1 = new JLabel();
	   	ring_2 = new JLabel();
	   	ring_3 = new JLabel();
	   	ring_4 = new JLabel();
	   	ring_5 = new JLabel();
	   	marble_0_stat = new JLabel();
	   	marble_1_stat = new JLabel();
	   	marble_2_stat = new JLabel();
	   	marble_3_stat = new JLabel();
	   	marble_4_stat = new JLabel();
	   	marble_5_stat = new JLabel();
	   	marbleColor0 = new JLabel();
	   	marbleColor1 = new JLabel();
	   	marbleColor2 = new JLabel();
	   	marbleColor3 = new JLabel();
	   	marbleColor4 = new JLabel();
	   	marbleColor5 = new JLabel();
	   	marbleColor6 = new JLabel();
	   	marbleColor7 = new JLabel();
	   	btnNewGame = new JButton("New Game");
	   	quitButton = new JButton("Quit");
	   	timerButton = new JButton("Pause");
	   	acceptButton = new JButton("Accept");
	   	giveUpButton = new JButton("Give Up");
	   	scoreBoard = new JTextArea();
	   	scrollPane = new JScrollPane(scoreBoard);
	   	menuBar = new JMenuBar();
	   	mnFile = new JMenu("File");
	   	mntmOptions = new JMenuItem("Options");
	   	mntmAbout = new JMenuItem("About");
	   	flowLayout = (FlowLayout) panel_6.getLayout();
	   	code = new Code();
	   	
	   	// Debug
	   	for (a = 0; a < 6; a++)
	   		System.out.println(code.getMarbles().get(a).getColor_list()[code.getMarbles().get(a).getColor_code()]);
	   	
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		JLabel[] labels = { marble_0,
							marble_1,
							marble_2,
							marble_3,
							marble_4,
							marble_5,
							marble_0_stat,
							marble_1_stat,
							marble_2_stat,
							marble_3_stat,
							marble_4_stat,
							marble_5_stat,
							marbleColor0,
							marbleColor1,
							marbleColor2,
							marbleColor3,
							marbleColor4,
							marbleColor5,
							marbleColor6,
							marbleColor7,
							ring_0,
							ring_1,
							ring_2,
							ring_3,
							ring_4,
							ring_5};
		
		frmCodeBreakerRing.setForeground(new Color(240, 240, 240));
		frmCodeBreakerRing.setResizable(false);
		frmCodeBreakerRing.setTitle("Code Breaker Ring");
		frmCodeBreakerRing.setBackground(new Color(240, 240, 240));
		frmCodeBreakerRing.setBounds(100, 100, 810, 630);
		frmCodeBreakerRing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCodeBreakerRing.getContentPane().setLayout(null);
		frmCodeBreakerRing.setJMenuBar(menuBar);
		
		frmCodeBreakerRing.getContentPane().add(game_container);
		frmCodeBreakerRing.getContentPane().add(panel_5);
		frmCodeBreakerRing.getContentPane().add(panel_6);
		frmCodeBreakerRing.getContentPane().add(panel_7);
		
		game_container.add(panel);
		game_container.add(panel_marble_stat_container);
		panel.add(panel_marble_0);
		panel.add(panel_marble_1);
		panel.add(panel_marble_2);
		panel_1.add(btnNewGame);
		panel_2.add(scrollPane);
		panel_3.add(acceptButton);
		panel_3.add(timerButton);
		panel_3.add(giveUpButton);
		panel_5.add(panel_1);
		panel_5.add(panel_2);
		panel_5.add(panel_3);
		panel_7.add(quitButton);
		panel_marble_0.add(marble_0);
		panel_marble_0.add(marble_1);
		panel_marble_0.add(ring_0);
		panel_marble_0.add(ring_1);
		panel_marble_1.add(marble_5);
		panel_marble_1.add(marble_2);
		panel_marble_1.add(ring_5);
		panel_marble_1.add(ring_2);
		panel_marble_2.add(marble_3);
		panel_marble_2.add(marble_4);
		panel_marble_2.add(ring_3);
		panel_marble_2.add(ring_4);
		panel_marble_stat_container.add(marble_0_stat_panel);
		panel_marble_stat_container.add(marble_1_stat_panel);
		panel_marble_stat_container.add(marble_2_stat_panel);
		panel_marble_stat_container.add(marble_3_stat_panel);
		panel_marble_stat_container.add(marble_4_stat_panel);
		panel_marble_stat_container.add(marble_5_stat_panel);
		menuBar.add(mnFile);
		mnFile.add(mntmOptions);
		mnFile.add(mntmAbout);

		game_container.setBounds(5, 5, 500, 450);
		panel.setBounds(0, 0, 450, 450);
		panel_1.setBounds(5, 5, 285, 70);
		panel_2.setBounds(5, 80, 285, 285);
		panel_3.setBounds(5, 370, 285, 70);
		panel_5.setBounds(505, 5, 295, 450);
		panel_6.setBounds(5, 455, 500, 120);
		panel_7.setBounds(505, 455, 294, 120);
		panel_marble_0.setBounds(5, 5, 440, 145);
		panel_marble_1.setBounds(5, 150, 440, 150);
		panel_marble_2.setBounds(5, 300, 440, 145);
		marble_0_stat_panel.setBounds(5, 5, 40, 70);
		marble_1_stat_panel.setBounds(5, 75, 40, 75);
		marble_2_stat_panel.setBounds(5, 150, 40, 75);
		marble_3_stat_panel.setBounds(5, 225, 40, 75);
		marble_4_stat_panel.setBounds(5, 300, 40, 75);
		marble_5_stat_panel.setBounds(5, 375, 40, 70);
		panel_marble_stat_container.setBounds(450, 0, 50, 450);
		
		marble_0.setBounds(105, 63, 50, 50);
		marble_1.setBounds(285, 63, 50, 50);
		marble_2.setBounds(355, 53, 50, 50);
		marble_3.setBounds(285, 53, 50, 50);
		marble_4.setBounds(105, 53, 50, 50);
		marble_5.setBounds(35, 53, 50, 50);
		ring_0.setBounds(100, 58, 60, 60);
		ring_1.setBounds(280, 58, 60, 60);
		ring_2.setBounds(350, 48, 60, 60);
		ring_3.setBounds(280, 48, 60, 60);
		ring_4.setBounds(100, 48, 60, 60);
		ring_5.setBounds(30, 48, 60, 60);
		btnNewGame.setBounds(0, 0, 285, 70);
		scoreBoard.setBounds(0, 0, 4, 22);
		scrollPane.setBounds(0, 0, 285, 285);
		acceptButton.setBounds(10, 25, 80, 23);
		timerButton.setBounds(200, 25, 70, 23);
		giveUpButton.setBounds(105, 25, 85, 23);
		quitButton.setBounds(2, 2, 288, 115);
		
		game_container.setLayout(null);
		panel.setLayout(null);
		panel_1.setLayout(null);
		panel_2.setLayout(null);
		panel_3.setLayout(null);
		panel_5.setLayout(null);
		panel_7.setLayout(null);
		panel_marble_0.setLayout(null);
		panel_marble_1.setLayout(null);
		panel_marble_2.setLayout(null);
		panel_marble_stat_container.setLayout(null);
		
		marble_0_stat_panel.setLayout(new BorderLayout(0, 0));
		marble_1_stat_panel.setLayout(new BorderLayout(0, 0));
		marble_2_stat_panel.setLayout(new BorderLayout(0, 0));
		marble_3_stat_panel.setLayout(new BorderLayout(0, 0));
		marble_4_stat_panel.setLayout(new BorderLayout(0, 0));
		marble_5_stat_panel.setLayout(new BorderLayout(0, 0));

		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_marble_stat_container.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		btnNewGame.setFont(new Font("Tahoma", Font.PLAIN, 20));
		quitButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnFile.setFont(new Font("Segoe UI", Font.PLAIN, 12));

		scoreBoard.setEditable(false);

		flowLayout.setVgap(45);
		flowLayout.setHgap(10);
		
		labels[pos + 20].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/ring.png")));;
		
		acceptButton.addMouseListener(new MouseAdapter() {
	   		@Override
	   		public void mouseClicked(MouseEvent e) {
	   			ans[pos] = getFileName(labels[pos].getIcon().toString());
	   			
	   			System.out.println(getFileName(labels[pos].getIcon().toString()));
	   			
	   			if (checkWin()) {
	   				JOptionPane.showMessageDialog(game_container, "You won!!!");
	   				
	   				acceptButton.setEnabled(false);
	   				giveUpButton.setEnabled(false);
	   				acceptButton.removeMouseListener(this);
	   				giveUpButton.removeMouseListener(this);
	   			}
	   			
	   			dummy[pos] = CodeBreakerGUI.code.hint(getColorCode(getFileName(labels[pos].getIcon().toString())), pos);
	   			
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
	   			
	   			if (pos != 5) {
	   				pos++;
	   			} else {
	   				pos = 0;
	   			}
	   			
	   			for (a = 0; a < 6; a++) {
	   				labels[a + 20].setIcon(null);
	   				labels[a + 20].revalidate();
	   			}
	   			
	   			labels[pos + 20].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/ring.png")));	   			
	   		}
	   	});
		
		timerButton.addMouseListener(new MouseAdapter() {
	   		@Override
	   		public void mouseClicked(MouseEvent e) {
	   			if (timerButton.getText().contains("Pause")) {
	   				timerButton.setText("Start");
	   			} else {
	   				timerButton.setText("Pause");
	   			}
	   		}
	   	});
		
		btnNewGame.addMouseListener(new MouseAdapter() {
	   		@Override
	   		public void mouseClicked(MouseEvent e) {
	   			newGame(labels);
	   		}
	   	});
		
		quitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});

		for (a = 0; a < 6; a++) {
			labels[a].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/hole.png")));
			labels[a + 6].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/empty_hint.png")));
			code.getMarbles().get(a).setLabel(labels[a]);
		}
		
		for (a = 0; a < 8; a++) {
			labels[a + 12].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/" 
																				+ this.color_list[a] 
																				+ "_" 
																				+ icon_set.toString()
																				+ "_shadow.png")));
			panel_6.add(labels[a + 12]);
			labels[a + 12].addMouseListener(new LabelListener(a, 
														 	  color_list, 
														 	  icon_set, 
														 	  code));
		}
		
		for (a = 6; a < labels.length - 6; a++) {
			labels[a].setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		marble_0_stat_panel.add(marble_0_stat);
		marble_1_stat_panel.add(marble_1_stat);
		marble_2_stat_panel.add(marble_2_stat);
		marble_3_stat_panel.add(marble_3_stat);
		marble_4_stat_panel.add(marble_4_stat);
		marble_5_stat_panel.add(marble_5_stat);
		
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
			System.out.println(ans[a] + "_" + code.getMarbles().get(a).getColor_list()[code.getMarbles().get(a).getColor_code()]);
			if (!ans[a].equalsIgnoreCase(code.getMarbles().get(a).getColor_list()[code.getMarbles().get(a).getColor_code()])) {
				return false;
			}
		}
		return true;
	}
	
	public void newGame(JLabel[] labels) {
		for (a = 0; a < 6; a++) {
			labels[a].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/hole.png")));
			labels[a + 6].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/empty_hint.png")));
			code.getMarbles().get(a).setLabel(labels[a]);
		}
		pos = 0;
	}

	public static int getPos() {
		return pos;
	}

	public static void setPos(int pos) {
		CodeBreakerGUI.pos = pos;
	}
	
	public int getColorCode(String color) {
		for (a = 0; a < 8; a++) {
			if (color_list[a].equalsIgnoreCase(color))
				return a;
		}
		return 10;
	}
}
