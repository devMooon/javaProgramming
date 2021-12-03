package swing.ppt.mouseMotionAdapterEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseMotionAdapterEX extends JFrame {
	private JLabel label;
	public MouseMotionAdapterEX() {
		super("마우스 이벤트 예제");
		
		buildGUI();
		registerListener();
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void buildGUI() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		label = new JLabel("No Mouse Event");
		
		this.add(label);
	}
	private void registerListener() {
		Container cp = this.getContentPane();
		cp.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				cp.setBackground(Color.cyan);
				label.setText("mousePressed (" + e.getX() + ", " + e.getY() + " )");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				cp.setBackground(Color.cyan);
				label.setText("mouseReleased (" + e.getX() + ", " + e.getY() + " )");
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				cp.setBackground(Color.yellow);
				
			}
			
		});
		
		cp.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
				cp.setBackground(Color.cyan);
				label.setText("mouseDragged (" + e.getX() + ", " + e.getY() + " )");
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				cp.setBackground(Color.cyan);
				label.setText("mouseMoved (" + e.getX() + ", " + e.getY() + " )");
				
			}
			
		});
	}
}
