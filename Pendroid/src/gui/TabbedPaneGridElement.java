package gui;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.CardLayout;

public class TabbedPaneGridElement extends JPanel {

	/**
	 * Create the panel.
	 */
	public TabbedPaneGridElement() {
		setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, "name_1928981628444");
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("0:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel.setBounds(0, 0, 133, 50);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("0:000s");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(133, 0, 133, 50);
		panel.add(lblNewLabel_1);
		
	}
}
