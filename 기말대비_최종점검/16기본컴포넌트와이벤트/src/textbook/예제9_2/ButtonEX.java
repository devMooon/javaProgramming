package textbook.예제9_2;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonEX extends JFrame {
	public ButtonEX() {
		super("예제 9-2");
		
		buildGUI();
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		
		this.add(createJPanel());
	}
	private JPanel createJPanel() {
		JPanel panel = new JPanel();
		
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.ORANGE);
		
		JButton btn1 = new JButton("button1");
		JButton btn2 = new JButton("button2");
		JButton btn3 = new JButton("button3");
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		return panel;
	}
}
