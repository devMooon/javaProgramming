package �����Ŭ����Ȱ��;

import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WindowEventEX extends JFrame {
	public WindowEventEX() {
		super("WindowEvent ����");
		
		buildGUI();
		registerEventListener();
		
		this.setBounds(300, 300, 500, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label = new JLabel("â �ݱ� ��ư�� ������ â�� �ݴ´ٴ� �޽����� ��µ˴ϴ�.");
		
		this.add(label);
	}
	private void registerEventListener() {
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("2) WindowListener(�������̽�)�� ������ WindowAdapter(�߻�Ŭ����)�� ���ϴ� �߻� �޼��常 �����ϴ� ���...");
				System.out.println("   WindowListener(�������̽�)�� ��� �߻�޼��带 ������ �߻� Ŭ������ �ƴ����� ������ ��ü�� �����ϸ� �����ϱ� ������ �߻� Ŭ������ ���� �س���");
				System.out.println("�����մϴ�.");
			}
			
		});
		/*this.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("1) WindowListener(�������̽�)�� ��� �߻� �޼��带 �����ϴ� ���...");
				System.out.println("�����մϴ�.");
				
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});*/
	}
}
