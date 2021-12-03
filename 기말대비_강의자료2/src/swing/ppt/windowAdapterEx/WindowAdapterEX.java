package swing.ppt.windowAdapterEx;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WindowAdapterEX {
	private JFrame frame;
	
	public WindowAdapterEX() {
		frame = new JFrame("����� �� �޽��� ������");
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.err.println("â�� ��Ĩ�ϴ�./ ��ȭ����");
			}

			@Override
			public void windowClosed(WindowEvent e) {
				System.err.println("â�� ��Ĩ�ϴ�.!!/ ��ȭ����");
			}
			
			
		});
		buildGUI();
		
		frame.setSize(200, 300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public void buildGUI() {
		JLabel label = new JLabel("��ư�� ���� ������.");
		JButton button = new JButton("����");
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		});
		
		frame.add(label, BorderLayout.NORTH);
		frame.add(button, BorderLayout.CENTER);
	}
}
