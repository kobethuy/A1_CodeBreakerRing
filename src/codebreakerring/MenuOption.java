package codebreakerring;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class MenuOption extends JDialog {
	
	private int max_item = 2;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblCurrentTime;
	private JLabel[] labels;

	/**
	 * Create the dialog.
	 */
	public MenuOption() {
		lblCurrentTime = new JLabel("Current time: " + CodeBreakerMain.getTimer().getTimer() + " min");
		initialize();
	}
	public void initialize() {
		setTitle("Options");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Icon Set", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Icon Set", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 206, 206);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setBounds(10, 20, 186, 20);
		panel.add(comboBox);
		
		for (int a = 0; a < max_item; a++) {
			comboBox.addItem(String.valueOf(a));
		}
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MenuOption.class.getResource("/codebreakerring/img/red_" + comboBox.getSelectedItem().toString() + ".png")));
		lblNewLabel.setBounds(75, 100, 50, 50);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Timer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(216, 11, 206, 206);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JSpinner spinner = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
		spinner.setBounds(10, 20, 100, 20);
		panel_1.add(spinner);
		
		JLabel lblMinutes = new JLabel("minutes");
		lblMinutes.setHorizontalAlignment(SwingConstants.CENTER);
		lblMinutes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMinutes.setBounds(111, 20, 85, 20);
		panel_1.add(lblMinutes);
		
		
		lblCurrentTime.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCurrentTime.setBounds(10, 65, 186, 20);
		panel_1.add(lblCurrentTime);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(10, 96, 186, 20);
		panel_1.add(label);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
						if (Timer.getStart()) {
							JOptionPane.showMessageDialog(CodeBreakerMain.getGuiThread().getWindow().getGame_container(), "No game must not be in progress!!!");
						} else {
							CodeBreakerMain.getTimer().setTimer(((Integer)spinner.getValue()).intValue());
							CodeBreakerGUI.setIcon_set(Integer.decode(comboBox.getSelectedItem().toString()));
						}
						CodeBreakerGUI.changeIcon(labels);
						lblCurrentTime.setText("Current time: " + CodeBreakerMain.getTimer().getTimer() + " min");
						System.out.println(comboBox.getSelectedItem().toString());
						lblNewLabel.setIcon(new ImageIcon(MenuOption.class.getResource("/codebreakerring/img/red_" + comboBox.getSelectedItem().toString() + ".png")));
						setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	public void setLabels(JLabel[] labels) {
		this.labels = labels;
	}
}
