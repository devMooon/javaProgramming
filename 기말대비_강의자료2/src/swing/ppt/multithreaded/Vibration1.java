package swing.ppt.multithreaded;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Vibration1 {
	private JFrame frame;
	private JButton btn;
	
	public Vibration1() {
		frame = new JFrame("Vibration");
		
		buildGUI();
		
		frame.setBounds(20, 20,  200, 200);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {
		btn = new JButton("��������");
		frame.add(btn);
		
		btn.addActionListener(handler);
	}
	private ActionListener handler = new ActionListener() {
		private boolean cont;
		private int ofset = 10;
		
		/* 1�ܰ� ����� ��ư Ŭ�� �� ����
		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setLocation(frame.getX()+ofset, frame.getY());
			ofset = -ofset;
		}*/
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String s = e.getActionCommand();
			
			if(s.equals("��������")) {
				btn.setText("������");
				cont = true;
				
				while(cont) {
					frame.setLocation(frame.getX()+ofset, frame.getY());
					
					ofset = -ofset;
					
					try {
						Thread.sleep(300);
					} catch (InterruptedException e1) {
						
					}
				}
			}
			else {
				btn.setText("��������");
				cont = false;
			}
			
		}
		
	};
}
