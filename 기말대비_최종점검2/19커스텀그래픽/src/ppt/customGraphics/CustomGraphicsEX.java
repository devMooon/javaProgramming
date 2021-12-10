package ppt.customGraphics;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class CustomGraphicsEX extends JFrame {
	private BasicCanvas basicCanvas;
	public CustomGraphicsEX() {
		super("커스텀그래픽");
		
		buildGUI();
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void buildGUI() {
		
		basicCanvas = new BasicCanvas();
		this.add(basicCanvas);
		
		this.setJMenuBar(menu());
		//this.add(custom());
	}
	
	private JMenuBar menu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("커스텀그래픽");
		JMenuItem item = new JMenuItem("보이기");
		
		item.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				basicCanvas.setVisible(false);
				
			}
			
		});
		menuBar.add(menu);
		menu.add(item);		
		
		return menuBar;
	}
	
	private JPanel custom() {
		JPanel panel = new JPanel();
		
		//BasicCanvas basicCanvas = new BasicCanvas();
		//this.add(basicCanvas);
		
		return panel;
	}
	
	private class BasicCanvas extends JComponent {

		@Override
		public void paint(Graphics g) {
			g.fillOval(50, 50, 300, 200);
		}
		
	}
}
