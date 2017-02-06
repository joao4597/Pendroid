package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JProgressBar;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 674);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(12, 13, 154, 602);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(12, 13, 130, 230);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JSlider slider = new JSlider();
		slider.setBounds(40, 30, 50, 150);
		panel_1.add(slider);
		slider.setOrientation(SwingConstants.VERTICAL);
		
		textField = new JTextField();
		textField.setText("100.0");
		textField.setBounds(40, 184, 42, 22);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblCm = new JLabel("cm");
		lblCm.setBounds(85, 187, 30, 16);
		panel_1.add(lblCm);
		
		JLabel lblLength = new JLabel("Length");
		lblLength.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblLength.setHorizontalAlignment(SwingConstants.CENTER);
		lblLength.setBounds(0, 0, 130, 35);
		panel_1.add(lblLength);
		
		JLabel lblMinMax = new JLabel("min: 80; max: 120");
		lblMinMax.setBounds(0, 210, 130, 16);
		panel_1.add(lblMinMax);
		lblMinMax.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(12, 256, 130, 210);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JSlider slider_1 = new JSlider();
		slider_1.setBounds(40, 30, 50, 150);
		panel_2.add(slider_1);
		slider_1.setOrientation(SwingConstants.VERTICAL);
		
		JLabel lblNewLabel = new JLabel("Oscillations");
		lblNewLabel.setBounds(0, 0, 130, 35);
		panel_2.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		JLabel label = new JLabel("13");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(54, 178, 22, 22);
		panel_2.add(label);
		
		JTextPane txtpnAfastarPenduloDo = new JTextPane();
		txtpnAfastarPenduloDo.setText("Afastar pendulo do centro antes de iniciar");
		txtpnAfastarPenduloDo.setBounds(12, 479, 130, 55);
		panel.add(txtpnAfastarPenduloDo);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Joao\\workspace\\SerialTest\\Icons\\1486245858_start.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton.setBounds(12, 547, 130, 42);
		panel.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(178, 13, 792, 478);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 13, 275, 452);
		panel_3.add(tabbedPane);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Exp1", null, panel_7, null);
		panel_7.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_8.setBounds(0, 0, 270, 309);
		panel_7.add(panel_8);
		panel_8.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_9.setBounds(0, 313, 270, 109);
		panel_7.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Oscillations:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(12, 13, 122, 16);
		panel_9.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Length:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(12, 42, 56, 20);
		panel_9.add(lblNewLabel_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show in Graph");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(8, 71, 113, 25);
		panel_9.add(chckbxNewCheckBox);
		
		JButton btnDelete = new JButton("");
		btnDelete.setToolTipText("Delete");
		btnDelete.setIcon(new ImageIcon("C:\\Users\\Joao\\workspace\\SerialTest\\Icons\\1486175879_DeleteRed.png"));
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDelete.setBounds(208, 46, 50, 50);
		panel_9.add(btnDelete);
		
		JLabel lblNewLabel_4 = new JLabel("Equacion:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(299, 426, 481, 39);
		panel_3.add(lblNewLabel_4);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(299, 13, 481, 400);
		panel_3.add(panel_10);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(842, 539, 78, 22);
		contentPane.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"COM 1", "COM 2", "COM 3", "COM 4", "COM 5", "COM 6"}));
		
		JLabel lblConnectToPendroid = new JLabel("Connect to Pendroid");
		lblConnectToPendroid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblConnectToPendroid.setHorizontalAlignment(SwingConstants.CENTER);
		lblConnectToPendroid.setBounds(793, 504, 177, 22);
		contentPane.add(lblConnectToPendroid);
		
		Panel panel_4 = new Panel();
		panel_4.setBounds(793, 575, 177, 40);
		contentPane.add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5, "name_8884924401141");
		panel_5.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Connect");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Joao\\workspace\\SerialTest\\Icons\\1486232580_Circle_Red.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_2.setBounds(0, 0, 177, 40);
		panel_5.add(btnNewButton_2);
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6, "name_8884943577107");
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Connected");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Joao\\workspace\\SerialTest\\Icons\\1486232575_Circle_Green.png"));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 6, 177, 27);
		panel_6.add(lblNewLabel_1);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(209, 539, 543, 40);
		progressBar.setIndeterminate(true);
		contentPane.add(progressBar);
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_4.removeAll();
				panel_4.repaint();
				panel_4.revalidate();
				panel_4.add(panel_6);
				panel_4.repaint();
				panel_4.revalidate();
			}
		});
	}
}
