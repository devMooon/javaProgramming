package 기본컴포넌트;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEX extends JFrame {
	
	public JComponentEX() {
		super("JComponent 주요 메서드 연습");
		
		buildGUI();
		
		this.setBounds(500, 300, 260, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton("Disabled Button");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setFont(new Font("Arial", Font.ITALIC, 20));
		b1.setForeground(Color.MAGENTA);
		b1.setBackground(Color.YELLOW);
		
		b2.setEnabled(false);
		
		b3.addActionListener(handler);
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
	}
	private ActionListener handler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton)e.getSource();
			JFrame frame = (JFrame)button.getTopLevelAncestor();
			frame.setTitle(button.getX() + ", " + button.getY());		
			
		}
	};
}
