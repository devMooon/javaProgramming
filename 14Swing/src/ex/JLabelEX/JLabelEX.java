package ex.JLabelEX;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JLabelEX extends JFrame {
	public JLabelEX(){
		super("Label 연습");
		
		bulidGUI();
		
		this.setSize(400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void bulidGUI() {
		this.add(makePanel());
	}
	private JPanel makePanel() {
		JPanel panel = new JPanel(new FlowLayout());
		
		
		ImageIcon bananaImage = new ImageIcon("image/바나나.jpg");
		
		JLabel banana = new JLabel("바나나 좋아해?", bananaImage, SwingConstants.CENTER);
		
		banana.setSize(10, 10);
		
		panel.add(banana);
		
		return panel;
	}
}
