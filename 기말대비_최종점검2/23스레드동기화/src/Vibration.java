import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Vibration extends JFrame {
	private Thread thread;
	
	public Vibration() {
		super("진동예제");
		
		buildGUI();
		
		this.setSize(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		
		JButton startButton = new JButton("start");
		JButton stopButton = new JButton("stop");
		startButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				thread = new Thread(new createRunnable());
				thread.start();
			}
			
		});
		stopButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				thread = null;
			}
			
		});
		
		
		this.add(startButton, BorderLayout.NORTH);
		this.add(stopButton, BorderLayout.SOUTH);
	}
	private class createRunnable implements Runnable{
		int term = 20;
		@Override
		public void run() {
			while(thread == Thread.currentThread()) {
				int x = Vibration.this.getX();
				int y = Vibration.this.getY();
				
				Vibration.this.setLocation(x + term, y);
				
				term = -term;
				
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
