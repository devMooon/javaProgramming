package 상속과다형성;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Canvas extends JFrame {
	private Vector<Polygon> v;
	private int size;
	private BasicCanvas b;
	
	public Canvas(int size) {
		super("도형 그리기");
		
		v = new Vector<Polygon>();
		this.size = size;
		
		buildGUI();
		
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		b = new BasicCanvas();
		
		this.setContentPane(b);
		this.setJMenuBar(makeMenuBar());
	}
	private JMenuBar makeMenuBar() {
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("Draw");
		JMenuItem rectangleItem = new JMenuItem("Rectangle");
		JMenuItem triangleItem = new JMenuItem("Triangle");
		
		rectangleItem.addActionListener(rectangleItemHandler);
		triangleItem.addActionListener(triangleItemHandler);
		
		menubar.add(menu);
		menu.add(rectangleItem);
		menu.add(triangleItem);
		
		return menubar;
	}
	
	public void draw(Polygon p) {
		v.add(p);
	}
	
	public void display() {
		Iterator<Polygon> itr = v.iterator();
		while(itr.hasNext()) {
			itr.next().show();
		}
	}
	private ActionListener rectangleItemHandler = new ActionListener() {
		private Random r = new Random();
		@Override
		public void actionPerformed(ActionEvent e) {
			String string = JOptionPane.showInputDialog(Canvas.this, "사각형의 넓이와 높이를 콤마(,)로 구분해서 적어주세요.", "사각형 입력", JOptionPane.QUESTION_MESSAGE);
			String strW = string.split(",")[0].trim();
			String strH = string.split(",")[1].trim();
			
			int intW = Integer.parseInt(strW);
			int intH = Integer.parseInt(strH);
			
			int x = r.nextInt(500);
			int y = r.nextInt(500);
			
			v.add(new Rectangle(x, y, intW, intH));
			
			b.repaint();
		}
		
	};
	private ActionListener triangleItemHandler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	};
	
	private class BasicCanvas extends JComponent {

		@Override
		public void paint(Graphics g) {
			
			Iterator itr = v.iterator();
			while(itr.hasNext()) {
				if(itr instanceof Rectangle) {
					Rectangle r = (Rectangle)itr;
					g.fillRect(r.x, r.y, r.w, r.h);
				}
				else {
					//Triangle t = (Triangle)itr;
					//삼각형 그리기 메서드 없음
					//g.fillRect(t.x, t.y, t.w, t.h);
				}
			}
		}
		
	}
}
