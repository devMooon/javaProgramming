package _JComponentEX;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JComponentEX extends JFrame {
	
	public JComponentEX() {
		super("JComponent�� ���� �޼��� ����");

		buildGUI();
		
		this.setBounds(0, 0, 300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		JPanel panel = new JPanel(new GridLayout());
		
	}
}
