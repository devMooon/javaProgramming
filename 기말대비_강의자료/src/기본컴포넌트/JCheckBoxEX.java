package 기본컴포넌트;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JCheckBoxEX extends JFrame {
	public JCheckBoxEX() {
		super("JCheckBox 연습");
		
		buildGUI();
		
		this.setBounds(500, 300, 200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JCheckBox checkBox1 = new JCheckBox("사과");
		JCheckBox checkBox2 = new JCheckBox("바나나", true);
		
		ImageIcon image = new ImageIcon("image/apple.jpg");
		ImageIcon image2 = new ImageIcon("image/banana.jpg");
		JCheckBox checkBox3 = new JCheckBox("체리", image);
		checkBox3.setSelectedIcon(image2);
		
		panel.add(checkBox1);
		panel.add(checkBox2);
		panel.add(checkBox3);
		
		this.add(panel);
	}
}
