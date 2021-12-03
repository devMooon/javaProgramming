package swing.ppt.customGraphicsEx;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class GraphicsDrawLineEX {
	private JFrame frame;
	public GraphicsDrawLineEX() {
		frame = new JFrame("BasicDrawing");
		
		buildGUI();
		
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {
		BasicDrawing bd = new BasicDrawing();
		
		frame.add(bd);
	}
	class BasicDrawing extends JComponent {

		@Override
		public void paint(Graphics g) {
			g.drawLine(0, 0, 100, 50);
		}
		
		
	}
}
