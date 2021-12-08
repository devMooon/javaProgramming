package ppt.borderLayoutEX;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BorderLayoutEX extends JFrame {
	private JLabel label;
	
	public BorderLayoutEX() {
		super("Hello2");
		
		buildGUI();
		
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		this.add(createNorth(), BorderLayout.NORTH);
		this.add(createSouth(), BorderLayout.SOUTH);
	}
	private JPanel createNorth() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JTextField textField = new JTextField(10);
		JButton button = new JButton("»Æ¿Œ");
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(textField.getText());
			}
		});
		
		panel.add(textField);
		panel.add(button);
		
		return panel;
	}
	private JPanel createSouth() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		label = new JLabel();
		
		panel.add(label);
		
		return panel;
	}
}
