package timerEX;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Timer extends JFrame {
	private int time = 0;
	private JLabel number;
	private Thread timerThread;
	private Thread vibrationThread;
	
	public Timer() {
		super("타이머");
		
		buildGUI();
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		this.addWindowListener(windowHandler);
		this.add(text(), BorderLayout.CENTER);
		this.setJMenuBar(createJMenuBar());
	}
	private JPanel text() {
		JPanel panel = new JPanel(new FlowLayout());
		number = new JLabel(time + "");
		number.setFont(new Font("Serif", Font.BOLD, 80));
		
		panel.add(number);
		
		return panel;
	}
	private JMenuBar createJMenuBar() {
		JMenuBar menubar = new JMenuBar();
		JMenu timerMenu = new JMenu("Timer");
		JMenuItem timerStartItem = new JMenuItem("Start");
		JMenuItem timerStopItem = new JMenuItem("Stop");
		
		JMenu vibrationMenu = new JMenu("Vibration");
		JMenuItem vibrationStartItem = new JMenuItem("Start");
		JMenuItem vibrationStopItem = new JMenuItem("Stop");
		
		timerStartItem.addActionListener(timerStartHandler);
		timerStopItem.addActionListener(timerStopHandler);
		vibrationStartItem.addActionListener(vibrationStartHandler);
		vibrationStopItem.addActionListener(vibrationStopHandler);
		
		menubar.add(timerMenu);
		menubar.add(vibrationMenu);
		timerMenu.add(timerStartItem);
		timerMenu.add(timerStopItem);
		vibrationMenu.add(vibrationStartItem);
		vibrationMenu.add(vibrationStopItem);
		
		return menubar;
	}
	private WindowListener windowHandler = new WindowAdapter() {

		@Override
		public void windowClosing(WindowEvent e) {
			int result = JOptionPane.showConfirmDialog(Timer.this, "종료하시겠습니까?", 
					"종료", JOptionPane.YES_NO_OPTION);
			
			if(result == JOptionPane.YES_NO_OPTION) System.exit(0);
		}
		
	};
	
	private ActionListener timerStartHandler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			timerThread = new Thread(new CreateTimerRunnable());
			timerThread.start();
			
		}
		
	};
	
	private ActionListener timerStopHandler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			timerThread = null;			
		}
		
	};
	
	private ActionListener vibrationStartHandler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			vibrationThread = new Thread(new CreateVibrationRunnable());
			vibrationThread.start();
			
		}
		
	};
	private ActionListener vibrationStopHandler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			vibrationThread = null;			
		}
		
	};
	
	private class CreateTimerRunnable implements Runnable {
		private int term = 20;
		
		@Override
		public void run() {
			while(timerThread == Thread.currentThread()) {
				time++;
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				number.setText(time + "");			
				
			}
			
		}
		
	}
	
	private class CreateVibrationRunnable implements Runnable {
		private int term = 20;
		
		@Override
		public void run() {
			while(vibrationThread == Thread.currentThread()) {
				int x = Timer.this.getLocation().x;
				int y = Timer.this.getLocation().y;
				
				Timer.this.setLocation(x + term, y);
				
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
}
