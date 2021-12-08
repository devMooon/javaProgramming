package arrayListEX;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ArrayListEX {
	private JFrame frame;
	private ArrayList<String> list;
	private Thread thread;
	private JLabel label;
	
	public ArrayListEX() {
		frame = new JFrame("ArrayList");
		
		list = new ArrayList<String>();
		buildGUI();
		
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {
		frame.setLayout(new BorderLayout());
		
		thread = new Thread(new createTread());
		thread.start();
		
		JButton btn = new JButton("값 추가");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String answer = JOptionPane.showInputDialog(frame, "문자열을 하나 입력하세요.", "입력", JOptionPane.QUESTION_MESSAGE);
				list.add(answer);
				
			}
			
		});
		
		label = new JLabel("  ");
		
		frame.add(btn, BorderLayout.CENTER);
		frame.add(label, BorderLayout.SOUTH);		
	}
	
	private class createTread extends Thread{

		@Override
		public void run() {
			while(thread == Thread.currentThread()) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(list.size() > 0) {
					Iterator<String> itr = list.iterator();
					String maxString = list.get(0);
					while(itr.hasNext()) {
						String str = itr.next();
						if(str.length() > maxString.length()) maxString = str;
					}
					label.setText("길이가 가장 긴 문자열은 " + maxString + "입니다.");
				}
			}
		}
		
	}
}
