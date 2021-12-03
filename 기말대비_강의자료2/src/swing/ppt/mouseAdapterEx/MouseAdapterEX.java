package swing.ppt.mouseAdapterEx;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterEX extends JFrame {
	private JLabel label;
	public MouseAdapterEX() {
		super("마우스 어댑터 예제");
		
		buildGUI();
		
		this.addMouseListener(clickedListener); 
		
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		this.setLayout(null);
		
		label = new JLabel("Hello");
		label.setBounds(30, 30, 50, 20);
		this.add(label);
	}
	
	private MouseAdapter clickedListener = new MouseAdapter() {

		@Override
		public void mouseClicked(MouseEvent e) {
			label.setLocation(e.getX(), e.getY()) ;
			 
		}
		
	};
	
}
