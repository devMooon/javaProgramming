package swing.ppt.multithreaded;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Vibration {
	private JFrame frame;
	private JButton button;
	Thread thread;
	
	public Vibration() {
		frame = new JFrame("Vibration");
		
		buildGUI();
		
		frame.setBounds(20, 20, 200, 200);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {
		button = new JButton("진동시작");
		frame.add(button);
		
		button.addActionListener(handler);
	}
	private ActionListener handler = new ActionListener() {
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String s = e.getActionCommand();
			
			if(s.equals("진동시작")) {
				button.setText("진동끝");
				
				//쓰레드 객체 생성 후 runable 상태로 만들기
				//thread = new VibrationThread();
				thread = new Thread(new VibrationRunnable());
				thread.start();
			}
			else {
				//쓰레드 제거
				button.setText("진동시작");
				thread = null;
			}
			
		}
		
	};
	
	/*class VibrationThread extends Thread {
		
		private int ofset = 20;
		
		@Override
		public void run() {
			while(thread == Thread.currentThread()) {
				frame.setLocation(frame.getLocation().x + ofset, frame.getLocation().y);
				
				ofset = -ofset;
				
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			}
		}
		
	}*/
	
	class VibrationRunnable implements Runnable {
		
		private int ofset = 20;
		
		@Override
		public void run() {
			while(thread == Thread.currentThread()) {
				frame.setLocation(frame.getLocation().x + ofset, frame.getLocation().y);
				
				ofset = -ofset;
				
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			}
		}
		
	}
}
