package 어댑터클래스활용;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseMotionListenerEX extends JFrame {
	private Container contentPane;
	
	public MouseMotionListenerEX() {
		super("MouseMotionListener 연습입니다.");
		
		buildGUI();
		
		this.setBounds(300, 300, 500, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		contentPane = this.getContentPane();
		contentPane.setBackground(Color.GRAY);
		contentPane.addMouseMotionListener(new MyMouseMotionLister());	
	}
	
	class MyMouseMotionLister extends MouseMotionAdapter{

		
		@Override
		public void mouseMoved(MouseEvent e) {
			if(e.MOUSE_DRAGGED == MouseEvent.MOUSE_DRAGGED)
				contentPane.setBackground(Color.YELLOW);
			else
				contentPane.setBackground(Color.GRAY);
		}
		
	}

}
