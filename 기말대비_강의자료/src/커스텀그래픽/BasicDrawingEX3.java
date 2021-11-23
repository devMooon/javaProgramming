package 커스텀그래픽;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class BasicDrawingEX3 {
	private JFrame frame;
	
	public BasicDrawingEX3() {
		frame = new JFrame("자동차 그리기");
		
		buildGUI();
		
		frame.setBounds(300, 200, 200, 200);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {
		MyComponent c = new MyComponent();
		
		frame.add(c);
	}
	private class MyComponent extends JComponent {
		private final int x = 50;
		private final int y = 50;
		private final int width = 80;
		private final int height = 20;
		private final int distance = 20;
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);
			
			g.setColor(new Color(255, 0, 0, 128));
			
			g.fillRect(x, y + 5, width, height);
			g.fillRect(x - distance, y + height, width + distance*2, height);
			
			g.setColor(Color.BLACK);
			
			g.fillOval(x - distance/2, y + height*2, distance, distance);
			g.fillOval(x - distance/2 + width, y + height*2, distance, distance);
			g.drawLine(x - distance*2, y + height*3, x + width + distance*2, y + height*3);
			
			/*g.drawRect(x, y, width, height);
			g.drawRect(x - distance, y + height, width + distance*2, height);
			g.drawOval(x - distance/2, y + height*2, distance, distance);
			g.drawOval(x - distance/2 + width, y + height*2, distance, distance);
			g.drawLine(x - distance*2, y + height*3, x + width + distance*2, y + height*3);*/		
			
		}
		
	}
}
