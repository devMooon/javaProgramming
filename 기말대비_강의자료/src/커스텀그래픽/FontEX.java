package 커스텀그래픽;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class FontEX extends JFrame {
	public FontEX() {
		super("논리적 폰트 연습입니다.");
		
		buildGUI();
		
		this.setBounds(300, 200, 300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);		
	}
	private void buildGUI() {
		MyComponent c = new MyComponent();
		
		this.add(c);
	}
	private class MyComponent extends JComponent {
		Font[] font = new Font[5];
		
		public MyComponent() {
			font[0] = new Font("Serif", Font.PLAIN, 20);
			font[1] = new Font("SansSerif", Font.PLAIN, 20);
			font[2] = new Font("Monospaced", Font.PLAIN, 20);
			font[3] = new Font("Dialog", Font.PLAIN, 20);
			font[4] = new Font("DialogInput", Font.PLAIN, 20);
		}
		

		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);
			
			for(int i = 0; i < font.length; i++) {
				g.setFont(font[i]);
				g.drawString("ABCDEFGHIJKLMNOP", 10, 50 + 20 * i);
			}
			
		}
		
	}
}
