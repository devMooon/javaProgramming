package ex.JButtonEX;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonEX extends JFrame {
	public JButtonEX(){
		super();
		
		bulidGUI();
		
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void bulidGUI() {
		ImageIcon apple = new ImageIcon("image/���.png");
		ImageIcon banana = new ImageIcon("image/�ٳ���.jpg");
		ImageIcon cherry = new ImageIcon("image/ü��.jpg");
		
		JButton button = new JButton(apple);
		button.setRolloverIcon(banana);
		button.setPressedIcon(cherry);
		
		this.add(button);
	}
}
