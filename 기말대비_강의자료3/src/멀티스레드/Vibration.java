package 멀티스레드;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Vibration extends JFrame {
	public Vibration() {
		super("Vibration");
		
		buildGUI();
		
		this.setSize(250, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	private void buildGUI() {
		BasicCanvas b = new BasicCanvas();
		
		
		this.add(b);
		this.setJMenuBar(createMenuBar());
	}
	private JMenuBar createMenuBar() {
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("Vibration");
		JMenuItem startItem = new JMenuItem("Start");
		JMenuItem stoptItem = new JMenuItem("Stop");
		
		menubar.add(menu);
		menu.add(startItem);
		menu.add(stoptItem);
		
		return menubar;
		
	}
	
	private class BasicCanvas extends JComponent {
		private int x = 70;
		private int y = 50;
		private final int WIDTH = 100;
		private final int HEIGHT = 25;
		private boolean show = false;
		
		public BasicCanvas() {
			this.addMouseListener(mouseHandler);
		}
		@Override
		public void paint(Graphics g) {
			if(show) {
				g.setColor(new Color(255, 0, 0, 128));
				g.fillRect(x, y, WIDTH, HEIGHT);
				g.fillRect(x - HEIGHT, y + HEIGHT, WIDTH + HEIGHT * 2, HEIGHT);
				
				g.setColor(Color.BLACK);
				g.fillOval(x - HEIGHT / 2, y + HEIGHT * 2, HEIGHT, HEIGHT);
				g.fillOval(x - HEIGHT / 2 + WIDTH, y + HEIGHT * 2, HEIGHT, HEIGHT);
			}
		}
		private MouseListener mouseHandler = new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if(show) show = false;
				else show = true;
				
				repaint();
			}
			
		};
		
	}
}
