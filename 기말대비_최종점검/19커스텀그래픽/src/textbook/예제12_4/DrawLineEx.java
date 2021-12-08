package textbook.예제12_4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DrawLineEx extends JFrame {
	private JButton startBtn;
	private JButton stopBtn;
	private Thread thread;
	private BasicCanvas bc;
	public DrawLineEx() {
		super("예제 12-4");
		
		buildGUI();
		registerListener();
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		bc = new BasicCanvas();
		
		
		this.add(bc, BorderLayout.CENTER);
		this.add(buttons(), BorderLayout.SOUTH);
		
	}
	private JPanel buttons() {
		JPanel panel = new JPanel(new FlowLayout());
		
		startBtn = new JButton("Start");
		stopBtn = new JButton("Stop");
		
		panel.add(startBtn);
		panel.add(stopBtn);
		
		return panel;
		
	}
	private class BasicCanvas extends JComponent{
		int term = 10;
		@Override
		public void paint(Graphics g) {
			g.setColor(Color.red);
			g.drawLine(50, 50, 100, 100 + term);
			term += 10;
		}
		
	}
	private void registerListener() {
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(DrawLineEx.this, "종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_OPTION) System.exit(0);
			}
			
		});
		
		startBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				thread = new Thread(new createRunnable());
				thread.start();
				
			}
			
		});
		stopBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				thread = null;
			}
			
		});
		
	}
	private class createRunnable implements Runnable{
		
		@Override
		public void run() {
			while(thread == Thread.currentThread()) {
				bc.repaint();
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
