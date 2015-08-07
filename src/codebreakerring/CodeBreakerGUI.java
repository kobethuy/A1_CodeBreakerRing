package codebreakerring;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	
	private static JLabel lblTime, lblScore;
	
	private static String[] color_list = { "red", 
										   "orange", 
										   "yellow",
										   "green", 
										   "cyan",
										   "blue", 
										   "magnenta",
										   "pink"};
	
	private int a;
	
	private static int pos = 0, move = 0, score = 0;
	
	private static Integer icon_set = 0;

	private JButton quitButton,
					btnNewGame,
					acceptButton,
					giveUpButton;

	private JMenuBar menuBar;

	private JMenu mnFile;

	private JMenuItem mntmOptions,
					  mntmAbout;

	private FlowLayout flowLayout;
	
	private MenuOption options;
	private JTextArea giveUp;
	private static JLabel lblMove;
	
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
	   	lblMove = new JLabel("Move: " + move);
	   	lblScore = new JLabel("Score: " + score);
	   	giveUp = new JTextArea("");
	   	lblTime = new JLabel("Time: 00:00");
	   	btnNewGame = new JButton("New Game");
	   	quitButton = new JButton("Quit");
	   	acceptButton = new JButton("Accept");
	   	giveUpButton = new JButton("Give Up");
	   	menuBar = new JMenuBar();
	   	mnFile = new JMenu("File");
	   	mntmOptions = new JMenuItem("Options");
	   	mntmAbout = new JMenuItem("About");
	   	flowLayout = (FlowLayout) panel_6.getLayout();
	   	code = new Code();
	   	options = new MenuOption();
	   	
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
		panel_2.add(lblTime);
		panel_2.add(giveUp);
		panel_2.add(lblScore);
		panel_2.add(lblMove);
		panel_3.add(acceptButton);
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
		giveUp.setBounds(10, 80, 265, 195);
		lblMove.setBounds(135, 11, 140, 25);
		lblScore.setBounds(10, 50, 265, 20);
		lblTime.setBounds(10, 11, 115, 25);
		btnNewGame.setBounds(0, 0, 285, 70);
		acceptButton.setBounds(10, 25, 85, 23);
		giveUpButton.setBounds(190, 25, 85, 23);
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
		
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblScore.setFont(new Font("Tahoma", Font.PLAIN, 20));
		giveUp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMove.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewGame.setFont(new Font("Tahoma", Font.PLAIN, 20));
		quitButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnFile.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		giveUp.setEditable(false);

		flowLayout.setVgap(45);
		flowLayout.setHgap(10);
		
		labels[pos + 20].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/ring.png")));
		
		acceptButton.addMouseListener(new AcceptListener(labels, acceptButton, giveUpButton, game_container));
		
		btnNewGame.addMouseListener(new MouseAdapter() {
	   		@Override
	   		public void mouseClicked(MouseEvent e) {
	   			newGame(labels, acceptButton, giveUpButton);
	   		}
	   	});
		
		quitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		
		options.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		mntmOptions.addActionListener(new ActionListener() {
	   		public void actionPerformed(ActionEvent arg0) {
	   			options.setLabels(labels);
	   			options.setVisible(true);
	   		}
	   	});
		
		giveUpButton.addMouseListener(new MouseAdapter() {
	   		@Override
	   		public void mouseClicked(MouseEvent arg0) {
	   			
	   			if (!giveUpButton.isEnabled())
	   				return;
	   			
	   			JOptionPane.showMessageDialog(game_container, "You gave up!!!");
	   			CodeBreakerMain.getTimer().stop();
	   			lblScore.setText("Score: " + score);
	   			acceptButton.setEnabled(false);
	   			giveUpButton.setEnabled(false);
	   			for (a = 0; a < 6; a++) {
	   		   		giveUp.setText(giveUp.getText() + code.getMarbles().get(a).getColor_list()[CodeBreakerGUI.getCode().getMarbles().get(a).getColor_code()] + "\n");
	   			}
	   		}
	   	});

		for (a = 0; a < 6; a++) {
			labels[a].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/hole.png")));
			labels[a + 6].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/empty_hint.png")));
			code.getMarbles().get(a).setLabel(labels[a]);
		}
		
		for (a = 0; a < 8; a++) {
			labels[a + 12].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/" 
																				+ color_list[a] 
																				+ "_" 
																				+ icon_set.toString()
																				+ "_shadow.png")));
			panel_6.add(labels[a + 12]);
			labels[a + 12].addMouseListener(new MarbleChoiceListener(a));
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
	
	public void newGame(JLabel[] labels, JButton acceptButton, JButton giveUpButton) {
		giveUp.setText(null);
		labels[pos + 20].setIcon(null);
		code.clear();
		code.init();
		pos = 0;
		labels[pos + 20].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/ring.png")));
		for (int a = 0; a < 6; a++) {
			labels[a].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/hole.png")));
			labels[a + 6].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/empty_hint.png")));
			code.getMarbles().get(a).setLabel(labels[a]);
		}
		move = 0;
		score = 0;
		lblScore.setText("Score: " + score);
		lblMove.setText("Move: " + move);
		acceptButton.setEnabled(true);
		giveUpButton.setEnabled(true);
	}
	
	public static void gameWin(JPanel game_container, JButton acceptButton, JButton giveUpButton) {
		JOptionPane.showMessageDialog(game_container, "You won!!!");
		calcScore();
		lblScore.setText("Score: " + score);
		acceptButton.setEnabled(false);
		giveUpButton.setEnabled(false);
	}

	public static void gameOver(JPanel game_container, JButton acceptButton, JButton giveUpButton) {
		JOptionPane.showMessageDialog(game_container, "You lose!!!");
		calcScore();
		lblScore.setText("Score: " + score);
		acceptButton.setEnabled(false);
		giveUpButton.setEnabled(false);
	}
	
	public static int getPos() {
		return pos;
	}
	
	public static void setPos(int pos) {
		CodeBreakerGUI.pos = pos;
	}
	
	public static Code getCode() {
		return code;
	}
	
	public static JLabel getTimer() {
		return lblTime;
	}
	
	public static void setTimer(String timeLeft) {
		lblTime.setText(timeLeft);
	}

	public JPanel getGame_container() {
		return game_container;
	}

	public JButton getAcceptButton() {
		return acceptButton;
	}
	
	public JButton getGiveUpButton() {
		return giveUpButton;
	}

	public static Integer getIcon_set() {
		return icon_set;
	}
	
	public static void setIcon_set(Integer icon_set) {
		CodeBreakerGUI.icon_set = icon_set;
	}

	public static String[] getColor_list() {
		return color_list;
	}
	
	public static int getMove() {
		return move;
	}
	
	public static void setMove(int move) {
		CodeBreakerGUI.move = move;
	}

	public static JLabel getLblMove() {
		return lblMove;
	}

	public static void changeIcon(JLabel[] labels) {
		for (int a = 0; a < 8; a++) {
			
			labels[a + 12].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/" 
																				+ color_list[a] 
																				+ "_" 
																				+ icon_set.toString()
																				+ "_shadow.png")));
		}
	}
	
	public static void calcScore() {
		if (move == 6) {
			score = 1000;
		} else if (6 < move && move <= 12) {
			score = 750;
		} else if (12 < move && move <= 36) {
			score = 500;
		} else if (36 < move && move <= 42) {
			score = 250;
		} else if (42 < move && move <= 60) {
			score = 100;
		} else if (60 < move && move <= 72) {
			score = 50;
		} else {
			return;
		}
	}
}
