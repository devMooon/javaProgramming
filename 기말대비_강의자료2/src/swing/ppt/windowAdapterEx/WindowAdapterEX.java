package swing.ppt.windowAdapterEx;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class WindowAdapterEX {
	private JFrame frame;
	
	public WindowAdapterEX() {
		frame = new JFrame("����� �� �޽��� ������");
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				int ret = JOptionPane.showConfirmDialog(frame, "�����Ͻðڽ��ϱ�?", "����", JOptionPane.YES_NO_OPTION);
				if(ret == JOptionPane.YES_OPTION) System.exit(0);
				//else 
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
				int ret = JOptionPane.showConfirmDialog(frame, "�����Ͻðڽ��ϱ�?", "����", JOptionPane.YES_NO_OPTION);
				if(ret == JOptionPane.YES_OPTION) System.exit(0);
			}
			
		});
		
		frame.add(label, BorderLayout.NORTH);
		frame.add(button, BorderLayout.CENTER);
	}
}
