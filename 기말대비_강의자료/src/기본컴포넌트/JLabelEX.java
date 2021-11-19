package 기본컴포넌트;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JLabelEX {
	private JFrame frame;
	
	public JLabelEX() {
		frame = new JFrame("JLabel 연습");
		
		buildGUI();
		
		frame.setBounds(500, 300, 200, 200);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);		
	}
	private void buildGUI() {
		ImageIcon apple = new ImageIcon("image/apple.jpg");
		
		JLabel imagelabel = new JLabel("사과하세요.", apple, SwingConstants.CENTER);
		
		frame.add(imagelabel);
	}
}
