package codebreakerring;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class CodeBreakerGUI {

	private JFrame frmCodeBreakerRing;
	
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
				   	marbleColor7;
	private String[] color_list = {	"red", 
									"orange", 
									"yellow",
									"green", 
									"cyan",
									"blue", 
									"magnenta",
									"pink"};
	
	private int a;
	
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
		panel_marble_0 = new JPanel();
		panel_marble_1 = new JPanel();
		panel_marble_2 = new JPanel();
		marble_0 = new JLabel();
		marble_1 = new JLabel();
	   	marble_2 = new JLabel();
	   	marble_3 = new JLabel();
	   	marble_4 = new JLabel();
	   	marble_5 = new JLabel();
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
							marbleColor7};
		
		frmCodeBreakerRing.setForeground(new Color(240, 240, 240));
		frmCodeBreakerRing.setResizable(false);
		frmCodeBreakerRing.setTitle("Code Breaker Ring");
		frmCodeBreakerRing.setBackground(new Color(240, 240, 240));
		frmCodeBreakerRing.setBounds(100, 100, 810, 630);
		frmCodeBreakerRing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCodeBreakerRing.getContentPane().setLayout(null);
		
		game_container.setBounds(5, 5, 500, 450);
		frmCodeBreakerRing.getContentPane().add(game_container);
		game_container.setLayout(null);
		
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 0, 450, 450);
		game_container.add(panel);
		panel.setLayout(null);
		
		panel_marble_0.setBounds(5, 5, 440, 145);
		panel.add(panel_marble_0);
		panel_marble_0.setLayout(null);
		
		marble_0.setBounds(105, 63, 50, 50);
		panel_marble_0.add(marble_0);
		
		marble_1.setBounds(285, 63, 50, 50);
		panel_marble_0.add(marble_1);
		
		panel_marble_1.setBounds(5, 150, 440, 150);
		panel.add(panel_marble_1);
		panel_marble_1.setLayout(null);
		
		marble_5.setBounds(35, 53, 50, 50);
		panel_marble_1.add(marble_5);
		
		marble_2.setBounds(355, 53, 50, 50);
		panel_marble_1.add(marble_2);
		
		panel_marble_2.setBounds(5, 300, 440, 145);
		panel.add(panel_marble_2);
		panel_marble_2.setLayout(null);
		
		marble_4.setBounds(105, 53, 50, 50);
		panel_marble_2.add(marble_4);
		
		marble_3.setBounds(285, 53, 50, 50);
		panel_marble_2.add(marble_3);
		
		panel_marble_stat_container = new JPanel();
		panel_marble_stat_container.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_marble_stat_container.setBounds(450, 0, 50, 450);
		game_container.add(panel_marble_stat_container);
		panel_marble_stat_container.setLayout(null);
		
		marble_0_stat_panel = new JPanel();
		marble_0_stat_panel.setBounds(5, 5, 40, 70);
		panel_marble_stat_container.add(marble_0_stat_panel);
		marble_0_stat_panel.setLayout(new BorderLayout(0, 0));

		marble_0_stat_panel.add(marble_0_stat);

		marble_1_stat_panel = new JPanel();
		marble_1_stat_panel.setBounds(5, 75, 40, 75);
		panel_marble_stat_container.add(marble_1_stat_panel);
		marble_1_stat_panel.setLayout(new BorderLayout(0, 0));
		
		marble_1_stat_panel.add(marble_1_stat);
		
		marble_2_stat_panel = new JPanel();
		marble_2_stat_panel.setBounds(5, 150, 40, 75);
		panel_marble_stat_container.add(marble_2_stat_panel);
		marble_2_stat_panel.setLayout(new BorderLayout(0, 0));
	
		marble_2_stat_panel.add(marble_2_stat);
		
		marble_3_stat_panel = new JPanel();
		marble_3_stat_panel.setBounds(5, 225, 40, 75);
		panel_marble_stat_container.add(marble_3_stat_panel);
		marble_3_stat_panel.setLayout(new BorderLayout(0, 0));

		marble_3_stat_panel.add(marble_3_stat);
		
		marble_4_stat_panel = new JPanel();
		marble_4_stat_panel.setBounds(5, 300, 40, 75);
		panel_marble_stat_container.add(marble_4_stat_panel);
		marble_4_stat_panel.setLayout(new BorderLayout(0, 0));
		
		marble_4_stat_panel.add(marble_4_stat);
		
		marble_5_stat_panel = new JPanel();
		marble_5_stat_panel.setBounds(5, 375, 40, 70);
		panel_marble_stat_container.add(marble_5_stat_panel);
		marble_5_stat_panel.setLayout(new BorderLayout(0, 0));
		
		marble_5_stat_panel.add(marble_5_stat);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(505, 5, 295, 450);
		frmCodeBreakerRing.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBounds(5, 5, 285, 70);
		panel_5.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("New Game");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(0, 0, 285, 70);
		panel_1.add(btnNewButton);
		
		panel_2 = new JPanel();
		panel_2.setBounds(5, 80, 285, 285);
		panel_5.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea scoreBoard = new JTextArea();
		scoreBoard.setEditable(false);
		scoreBoard.setBounds(0, 0, 4, 22);
		panel_2.add(scoreBoard);
		
		JScrollPane scrollPane = new JScrollPane(scoreBoard);
		scrollPane.setBounds(0, 0, 285, 285);
		panel_2.add(scrollPane);
		
		panel_3 = new JPanel();
		panel_3.setBounds(5, 370, 285, 70);
		panel_5.add(panel_3);
		panel_3.setLayout(null);
		
		JButton acceptButton = new JButton("Accept");
		acceptButton.setBounds(10, 25, 80, 23);
		panel_3.add(acceptButton);
		
		JButton timerButton = new JButton("Pause");
		timerButton.setBounds(200, 25, 70, 23);
		panel_3.add(timerButton);
		
		JButton helpButton = new JButton("Help");
		helpButton.setBounds(105, 25, 85, 23);
		panel_3.add(helpButton);
		
		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		FlowLayout flowLayout = (FlowLayout) panel_6.getLayout();
		flowLayout.setVgap(45);
		flowLayout.setHgap(10);
		panel_6.setBounds(5, 455, 500, 120);
		frmCodeBreakerRing.getContentPane().add(panel_6);
		
		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBounds(505, 455, 294, 120);
		frmCodeBreakerRing.getContentPane().add(panel_7);
		panel_7.setLayout(null);
		
		JButton quitButton = new JButton("Quit");
		quitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		quitButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		quitButton.setBounds(2, 2, 288, 115);
		panel_7.add(quitButton);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		frmCodeBreakerRing.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.add(mnFile);
		
		JMenuItem mntmOptions = new JMenuItem("Options");
		mnFile.add(mntmOptions);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnFile.add(mntmAbout);
		
		for (a = 0; a < 6; a++) {
			labels[a].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/hole.png")));
		}
		
		for (a = 6; a < 12; a++) { 
			labels[a].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/empty_hint.png")));
		}
		
		for (a = 12; a < labels.length; a++) {
			labels[a].setIcon(new ImageIcon(CodeBreakerGUI.class.getResource("/codebreakerring/img/" + this.color_list[a - 12] + "_0.png")));
		}
		
		for (a = 6; a < labels.length; a++) {
			labels[a].setHorizontalAlignment(SwingConstants.CENTER);
		}
			
		for (a = 12; a < 20; a++) {
			panel_6.add(labels[a]);
			labels[a].addMouseListener(new LabelListener(labels[a]));
		}
	}
	
	public void newGame(JLabel[] labels) {
		for (int a = 0; a < labels.length; a++) {
			
		}
			
	}
}
