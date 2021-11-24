package 커스텀그래픽;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Vector;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class GraphicsDrawLineMouseEX extends JFrame {
	private Vector<Point> points = new Vector<Point>();
	
	public GraphicsDrawLineMouseEX() {
		super("Drawing Line by Mouse EX");
		
		buildGUI();
		
		this.setBounds(100, 50, 500, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		MyComponent c = new MyComponent();
		c.addMouseMotionListener(new MouseMotionAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				points.add(new Point(e.getX(), e.getY()));
				repaint();
			}
			
		});
		this.add(c);
	}
	private class MyComponent extends JComponent {
		private int x;
		private int y;
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			
			for(int i = 0; i < points.size(); i++) {
				x = (int) points.get(i).getX();
				y = (int) points.get(i).getY();
				
				g.drawRect(x, y, 1, 1);
			}
			
		}
		
	}
}
