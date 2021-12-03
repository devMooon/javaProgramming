package swing.ppt.customGraphicsEx;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class BasicDrawing2 extends JFrame {
	public BasicDrawing2() {
		super("BasicDrawing2");
		
		buildGUI();
		
		this.setSize(400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		BasicDrawing bd = new BasicDrawing();
		
		this.add(bd);
	}
	class BasicDrawing extends JComponent {
		static final int x = 150;
		static final int y = 100;
		static final int w = 80;
		static final int term = 10;
		@Override
		public void paint(Graphics g) {
			g.drawString("Hello, World", x+term, y-term);
			g.drawLine(x-term, y, w+x+term, y);
		}
		
	}
}
