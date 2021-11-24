package 커스텀그래픽;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class BasicDrawingEX extends JFrame {
	public BasicDrawingEX() {
		super("BasicDrawing");
		
		buildGUI();
		
		this.setBounds(300, 200, 300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		MyComponent graphic = new MyComponent();
		
		this.add(graphic);
	}
	
	class MyComponent extends JComponent {
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			
			g.drawLine(0, 0, 100, 50);
		}
		
	}
}
