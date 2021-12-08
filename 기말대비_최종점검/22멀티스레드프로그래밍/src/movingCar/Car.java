package movingCar;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Car extends JFrame {
	private JMenuItem startItem;
	private JMenuItem stopItem;
	private Thread thread = null;
	
	public Car() {
		super("Vibration Car");
		
		buildGUI();
		
		this.setSize(250, 250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		BasicCanvas b = new BasicCanvas();
		
		this.setJMenuBar(createJMenuBar());
		this.add(b);
	}
	private JMenuBar createJMenuBar() {
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("Option");
		startItem = new JMenuItem("Start");
		stopItem = new JMenuItem("Stop");
		
		startItem.addActionListener(startHadler);
		stopItem.addActionListener(stopHadler);
		
		menubar.add(menu);
		menu.add(startItem);
		menu.add(stopItem);
		
		return menubar;		
	}
	
	private ActionListener startHadler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			thread = new Thread(new CreateRunnable());
			thread.start();
		}
		
	};
	private ActionListener stopHadler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			thread = null;
			
		}
		
	};
	
	private class CreateRunnable implements Runnable {
		private int term = 20;
		
		@Override
		public void run() {
			while(thread == Thread.currentThread()) {
				Car.this.setLocation(Car.this.getX() + term, Car.this.getY());
				
				term = -term;
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	private class BasicCanvas extends JComponent {
		private int x = 70;
		private int y = 70;
		private final int WIDTH = 100;
		private final int HEIGHT = 25;
		private boolean show = false;
		
		public BasicCanvas() {
			this.addMouseListener(mouseHendler);
		}
		
		@Override
		public void paint(Graphics g) {
			g.setFont(new Font("SansSerif", Font.BOLD, 15));
			g.drawString("화면을 클릭해보세요!", x-35, y-20);
			
			if(show) {
				g.setColor(new Color(255, 0, 0, 128));
				g.fillRect(x, y, WIDTH, HEIGHT);
				g.fillRect(x - HEIGHT, y + HEIGHT, WIDTH + HEIGHT * 2, HEIGHT);
				
				g.setColor(Color.BLACK);
				g.fillOval(x - HEIGHT / 2, y + HEIGHT * 2, HEIGHT, HEIGHT);
				g.fillOval(x - HEIGHT / 2 + WIDTH, y + HEIGHT * 2, HEIGHT, HEIGHT);
			}
		}
		
		private MouseListener mouseHendler = new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if(show) show = false;
				else show = true;
				
				repaint();
			}
			
		};
		
	}
}
