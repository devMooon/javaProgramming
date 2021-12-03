package swing.hw.customGraphicsEx;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class CustomGraphicsEX extends JFrame {
	
	public CustomGraphicsEX() {
		super("ȭ���� Ŭ���غ�����.");
		
		buildGUI();
		
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		DrawingCanvas canvas = new DrawingCanvas();
		
		this.add(canvas);		
	}
	
	class DrawingCanvas extends JComponent {
		
		private Vector<Point> v = new Vector<Point>(); //���� ��ǥ�� �����ϴ� ����
		static final int radius = 50;
		private Point point = null;
		
		public DrawingCanvas() {
			registerListener();
		}
		
		@Override
		public void paint(Graphics g) { //������ ����ȭ, ��ü�� ó�� ������ ��, â ũ�Ⱑ ����� ��, repaint�� ȣ�� �� ��... 
			//-> vector�� ������ �ִ� Point������ �� �׷������?
			g.setColor(Color.ORANGE);
			
			Iterator<Point> itr = v.iterator();
			
			while(itr.hasNext()) {
				Point point = itr.next();
				
				int x = point.x;
				int y = point.y;
				
				System.out.print("( " + x +  " , " + y + " ) ");
				
				g.fillOval(x, y, radius*2, radius*2);
			}
			System.out.println();
			
		}
		
		private void registerListener() {
			this.addMouseListener(clicked);
			this.addMouseMotionListener(Dragged);
		}
		
		private MouseAdapter clicked = new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int newX = e.getX() - radius;
				int newY = e.getY() - radius;
				
				isvaild(e);
				if(point == null) {
					v.add(new Point(newX, newY));
					repaint();
				}
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				point = null;
			}


			@Override
			public void mousePressed(MouseEvent e) {
				isvaild(e);			
				
			}
			
			
		};
		
		private MouseMotionAdapter Dragged = new MouseMotionAdapter() {
			
			@Override
			public void mouseDragged(MouseEvent e) {
				int newX = e.getX() - radius;
				int newY = e.getY() - radius;
				
				if(point != null) {
					point.setLocation(new Point(newX, newY));
					repaint();
				}
					
			}
		};
		
		private void isvaild(MouseEvent e) {
			int newX = e.getX() - radius;
			int newY = e.getY() - radius;
			
			Iterator<Point> itr = v.iterator();
			
			while(itr.hasNext()) {
				Point p = (Point)itr.next();
				int x = p.x;
				int y = p.y;
				
				if((newX >= x - radius && newX <= x + radius) && (newY >= y - radius && newY <= y + radius)) {
					point = p;
					break;
				}
			}
		}
	}
}
