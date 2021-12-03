package swing.ppt.customGraphicsEx;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class BasicDrawing3 {
	private JFrame frame;
	
	public BasicDrawing3() {
		frame = new JFrame("자동차 그리기");
		
		buildGUI();
		
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {
		BasicDrawing bd = new BasicDrawing();
		
		frame.add(bd);
	}
	class BasicDrawing extends JComponent {
		static final int x = 100;
		static final int y = 100;
		static final int w = 150;
		static final int h = w/3;
		
		@Override
		public void paint(Graphics g) {
			g.drawRect(x + h, y - h, w, h);
			g.drawRect(x, y, w + h * 2, h);
			g.drawOval(x + 20, y + h, h, h);
			g.drawOval(x + w + h - 20, y + h, h, h);
			g.drawLine(x - h, y + h*2, x + w + h * 3, y + h*2);
		}
		
	}
}
