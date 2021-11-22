package 어댑터클래스활용;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEX {
	private JFrame frame;
	private JLabel label;
	
	public MouseListenerEX() {
		frame = new JFrame("MouseListener 연습입니다.");
		
		buildGUI();
		
		frame.setBounds(300, 300, 300, 300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {
		frame.setLayout(null);
		
		label = new JLabel("Hello");
		label.setSize(50, 20);
		label.setLocation(30, 30);
		
		frame.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				label.setLocation(e.getX(), e.getY());
			}
			
		});
		frame.add(label);
	}
	
}
