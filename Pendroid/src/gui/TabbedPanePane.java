package gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;

public class TabbedPanePane extends JPanel {

	private JPanel panel_7; 
	/**
	 * Create the panel.
	 */
	public TabbedPanePane() {
		setLayout(null);
		
		panel_7 = new JPanel();
		panel_7.setBounds(277, 5, 1, 1);
		//tabbedPane.addTab("Exp1", null, panel_7, null);
		panel_7.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_8.setBounds(0, 0, 270, 309);
		panel_7.add(panel_8);
		panel_8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
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
		//add(panel_7);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBounds(12, 5, 275, 452);
		//add(tabbedPane);
		tabbedPane.add(panel_7);
	}
	
	public JPanel getTabbedPanePane(){
		return panel_7;
	}
}
