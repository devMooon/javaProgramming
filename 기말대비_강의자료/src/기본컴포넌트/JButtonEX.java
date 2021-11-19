package 기본컴포넌트;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonEX extends JFrame {
	
	public JButtonEX() {
		super("JButton 연습입니다.");
		
		buildGUI();
		
		this.setBounds(500, 300, 200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		ImageIcon apple = new ImageIcon("image/apple.jpg");
		ImageIcon banana = new ImageIcon("image/banana.jpg");
		ImageIcon cherry = new ImageIcon("image/cherry.jpg");
		
		JButton button = new JButton("확인", apple);
		button.setRolloverIcon(banana);
		button.setPressedIcon(cherry);
		
		this.add(button);
	}
}
