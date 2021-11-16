package ex.JComponent_Method;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JComponentEX extends JFrame {
	
	public JComponentEX(){
		super("JComponent의 공통 메서드 예제");
		
		buildGUI();
		
		this.setBounds(0, 0, 260, 260);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		JPanel p = new JPanel(new FlowLayout());
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton("Disabled Button");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.MAGENTA);
		b1.setFont(new Font("Arial", Font.ITALIC, 20));
		
		b2.setEnabled(false);
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				JComponentEX frame = (JComponentEX) b.getTopLevelAncestor();
				
				frame.setTitle(b.getX() + "," + b.getY());
				
			}
			
		});
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		this.add(p);
	}
}
