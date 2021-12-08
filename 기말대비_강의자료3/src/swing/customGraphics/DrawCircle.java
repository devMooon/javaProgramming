package swing.customGraphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class DrawCircle extends JFrame {
	public DrawCircle() {
		super("Click & Drag");
		
		buildGUI();
		
		this.setSize(600, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		BasicCanvas b = new BasicCanvas();
		
		this.add(b);
	}
	
	private class BasicCanvas extends JComponent {
		private Vector<Point> v = new Vector<Point>();
		private Point clickedPoint = null;
		private final int RADIUS = 50;
		
		public BasicCanvas() {
			this.addMouseListener(mouseHandler);
			this.addMouseMotionListener(mouseMotionHandler);
		}
		
		@Override
		public void paint(Graphics g) {
			g.setColor(Color.ORANGE);
			
			Iterator<Point> itr = v.iterator();
			while(itr.hasNext()) {
				Point p = itr.next();
				g.fillOval(p.x, p.y, RADIUS * 2, RADIUS * 2);
			}
		}
		
		private MouseListener mouseHandler = new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if(clickedPoint == null) {
					int x = e.getX() - RADIUS;
					int y = e.getY() - RADIUS;
					v.add(new Point(x, y));
					BasicCanvas.this.repaint();
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Iterator<Point> itr = v.iterator();
				
				while(itr.hasNext()) {
					Point p = itr.next();
					if(e.getPoint().x == p.x && e.getPoint().y == p.y ) {
						clickedPoint = p;
						break;
					}
					else {
						clickedPoint = null;
					}
				}
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				clickedPoint = null;
			}
			
		};
		private MouseMotionListener mouseMotionHandler = new MouseMotionAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				if(clickedPoint != null) {
					clickedPoint.setLocation(e.getPoint());
					BasicCanvas.this.repaint();
				}
				
			}
			
		};
		
	}
}
