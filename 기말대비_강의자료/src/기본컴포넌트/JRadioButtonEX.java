package 기본컴포넌트;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButtonEX extends JFrame {
	public JRadioButtonEX() {
		super("JRadioButton 연습입니다.");
		
		buildGUI();
		
		this.setBounds(500, 300, 200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		this.setLayout(new FlowLayout());
		JRadioButton radio1 = new JRadioButton("사과", true);
		JRadioButton radio2 = new JRadioButton("배");
		
		ImageIcon image1 = new ImageIcon("image/banana.jpg");
		ImageIcon image2 = new ImageIcon("image/apple.jpg");
		
		JRadioButton radio3 = new JRadioButton("체리", image1);
		
		radio3.setSelectedIcon(image2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		group.add(radio3);
		
		this.add(radio1);
		this.add(radio2);
		this.add(radio3);
		
	}
}
