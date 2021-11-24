package 커스텀그래픽;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class BasicDrawingEX2 extends JFrame {
	public BasicDrawingEX2() {
		super("BasicDrawing 연습입니다.");
		
		buildGUI();
		
		this.setBounds(500, 500, 500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		MyComponent my = new MyComponent();
		
		this.add(my);
	}
	class MyComponent extends JComponent {
		private int x = 150;
		private int y = 100;
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);
			
			g.drawString("Hello, World", x, y);
			g.drawLine(x - 3, y + 10, x - 5 + 70, y + 10);
		}
		
	}	
}
