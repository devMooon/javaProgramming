package �⺻������Ʈ;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JLabelEX {
	private JFrame frame;
	
	public JLabelEX() {
		frame = new JFrame("JLabel ����");
		
		buildGUI();
		
		frame.setBounds(500, 300, 200, 200);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);		
	}
	private void buildGUI() {
		ImageIcon apple = new ImageIcon("image/apple.jpg");
		
		JLabel imagelabel = new JLabel("����ϼ���.", apple, SwingConstants.CENTER);
		
		frame.add(imagelabel);
	}
}
