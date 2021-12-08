package ��Ƽ���������α׷���;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Timer extends JFrame {
	private JLabel label;
	private JMenuItem itemStart;
	private JMenuItem itemStop;
	private Thread thread;
	private int num = 0;
	
	public Timer() {
		super("Ÿ�̸�");
		
		build();
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void build() {
		this.add(createLabel());
		this.setJMenuBar(createMenu());
	}
	private JPanel createLabel() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		label = new JLabel("0");
		label.setFont(new Font("Courier", Font.ITALIC, 80));
		
		panel.add(label);
		return panel;		
	}
	private JMenuBar createMenu() {
		JMenuBar menubar = new JMenuBar();
		JMenu menuOption = new JMenu("Option");
		itemStart = new JMenuItem("Start");
		itemStop = new JMenuItem("Stop");
		
		itemStart.addActionListener(startHandeler);
		itemStop.addActionListener(stoptHandeler);
		
		menubar.add(menuOption);
		menuOption.add(itemStart);
		menuOption.addSeparator();
		menuOption.add(itemStop);
		
		return menubar;
	}
	private ActionListener startHandeler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(thread != null) {
				JOptionPane.showMessageDialog(Timer.this, "�ð��� ������ ���� �־��!", "���", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				thread = new Thread(new CreateRunnable());
				thread.start();
			}			
		}
		
	};
	private ActionListener stoptHandeler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(thread == null) {
				JOptionPane.showMessageDialog(Timer.this, "���� �����Դϴ�!", "���", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				thread = null;
			}
						
		}
		
	};
	private class CreateRunnable implements Runnable {
		
		@Override
		public void run() {
			while(thread == Thread.currentThread()) {
				label.setText(num + "");
				num++;
				
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
