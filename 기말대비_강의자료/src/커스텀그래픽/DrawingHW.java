package 커스텀그래픽;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class DrawingHW extends JFrame {
	public DrawingHW() {
		super("JAVA프로그래밍 12주차 과제");
		
		buildGUI();
		
		this.setBounds(400, 100, 500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		PaintCanvas canvas = new PaintCanvas();
		
		this.add(canvas);
	}
	public class PaintCanvas extends JComponent{
		static final int width = 50;
		static final int height = 50;
		
		ArrayList<Point> pointList = new ArrayList<Point>();
		int dragId = -1;
		
		public PaintCanvas() {
			
			registerEventListener();
		}
		
		private void registerEventListener() {
			this.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseClicked(MouseEvent e) {
					pointList.add(new Point(e.getX() - 25, e.getY() - 25));
					repaint();
				}
				
			});
			this.addMouseMotionListener(new MouseMotionAdapter() {

				@Override
				public void mouseDragged(MouseEvent e) {
					if(pointList.size() != 0) {
						for(int i = 0; i < pointList.size(); i++) {
							int x = pointList.get(i).x;
							int y = pointList.get(i).y;
							
							if((e.getX()-25 >= x-25 && e.getX()-25 <= x+25) && (e.getY()-25 >= y-25 && e.getY()-25 <= y+25)) {
								dragId = i;
								break;
							}
						}
						if(dragId != -1) {
							pointList.set(dragId, new Point(e.getX() - 25, e.getY() - 25));
							repaint();
						}
						
					}
				}
				
			});
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.setColor(Color.ORANGE);
			
			for(int i = 0; i < pointList.size(); i++) {
				g.fillOval(pointList.get(i).x, pointList.get(i).y, width, height);
			}
			
		}
		
		
	}
}
