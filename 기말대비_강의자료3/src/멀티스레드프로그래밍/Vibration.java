package 멀티스레드프로그래밍;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Vibration extends JFrame {
	JButton button;
	Thread thread;
	
	public Vibration() {
		super("Vibration");
		
		buildGUI();
		
		this.setSize(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		button = new JButton("진동 시작");
		
		button.addActionListener(vibrationHandeler);
		
		this.add(button);
	}
	private ActionListener vibrationHandeler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			if(e.getActionCommand() == "진동 시작") {
				button.setText("진동 중지");
				
				//thread = new CreateThread();
				//thread.start();
				
				CreateRunnable runnable = new CreateRunnable();
				thread = new Thread(runnable);
				thread.start();
			}
			else {
				button.setText("진동 시작");
				thread = null;
			}
			
		}
		
	};

	private class CreateThread extends Thread {
		private int offset = 20;
		
		@Override
		public void run() {
			while(thread == Thread.currentThread()) {
				Vibration.this.setLocation(Vibration.this.getLocation().x + offset, Vibration.this.getLocation().y);
				offset = -offset;
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	private class CreateRunnable implements Runnable {
		private int offset = 20;
		@Override
		public void run() {
			while(thread == Thread.currentThread()) {
				Vibration.this.setLocation(Vibration.this.getLocation().x + offset, Vibration.this.getLocation().y);
				offset = -offset;
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}

}
