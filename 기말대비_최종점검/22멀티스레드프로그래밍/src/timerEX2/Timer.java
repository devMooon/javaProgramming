package timerEX2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Timer {
	private int num = 0;
	private JLabel timerLabel;
	private JFrame frame;
	private Thread thread;
	
	public Timer() {
		frame = new JFrame("Timer");
		
		buildGUI();
		
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void buildGUI() {
		frame.add(createJLable(), BorderLayout.CENTER);
		frame.add(createJButton(), BorderLayout.SOUTH);
	}
	
	private JPanel createJLable() {
		JPanel panel = new JPanel();
		
		timerLabel = new JLabel(num + "");
		timerLabel.setFont(new Font("Serif", Font.BOLD, 80));
		panel.add(timerLabel);
		
		thread = new Thread(new createRunnable());
		thread.start();
		
		return panel;
	}
	private JPanel createJButton() {
		JPanel panel = new JPanel();
		
		JButton button = new JButton("Kill Timer");
		panel.add(button);
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				thread = null;
				((JButton)e.getSource()).setEnabled(false);
			}
			
		});
		
		return panel;
	}
	private class createRunnable implements Runnable {

		@Override
		public void run() {
			while(thread == Thread.currentThread()) {
				num++;
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				timerLabel.setText(num + "");
			}
		}
		
	}
}
