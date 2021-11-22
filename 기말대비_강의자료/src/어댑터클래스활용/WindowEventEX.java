package 어댑터클래스활용;

import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WindowEventEX extends JFrame {
	public WindowEventEX() {
		super("WindowEvent 연습");
		
		buildGUI();
		registerEventListener();
		
		this.setBounds(300, 300, 500, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label = new JLabel("창 닫기 버튼을 누르면 창을 닫는다는 메시지가 출력됩니다.");
		
		this.add(label);
	}
	private void registerEventListener() {
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("2) WindowListener(인터페이스)를 구현한 WindowAdapter(추상클래스)의 원하는 추상 메서드만 구현하는 방법...");
				System.out.println("   WindowListener(인터페이스)의 모든 추상메서드를 구현해 추상 클래스는 아니지만 임의의 객체를 생성하면 위험하기 때문에 추상 클래스로 설정 해놓음");
				System.out.println("종료합니다.");
			}
			
		});
		/*this.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("1) WindowListener(인터페이스)의 모든 추상 메서드를 구현하는 방법...");
				System.out.println("종료합니다.");
				
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
