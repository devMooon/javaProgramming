package 배치관리자;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HelloEX2 extends JFrame {
	private JTextField textField;
	private JLabel label;
	
	public HelloEX2() {
		super("HelloEX2");
		
		buildGUI();
		
		this.setBounds(500, 300, 200, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);		
	}
	private void buildGUI() {
		this.setLayout(new BorderLayout());	

		//this.addMouseMotionListener(new mouseMotion(this));
		this.add(makeFlowLayout1(), BorderLayout.CENTER);
		this.add(makeFlowLayout2(), BorderLayout.SOUTH);
	}
	private JPanel makeFlowLayout1() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		textField = new JTextField(10);
		JButton button = new JButton("확인");
		
		panel.setBackground(Color.ORANGE);
		button.addActionListener(handler);
		
		panel.add(textField);
		panel.add(button);
		
		return panel;
	}
	private JPanel makeFlowLayout2() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		label = new JLabel("검색어를 입력하세요.");
		
		panel.add(label);
		
		return panel;
	}
	private ActionListener handler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText(textField.getText());			
		}
		
	};
	/*class mouseMotion extends MouseMotionAdapter {
		
		private JFrame frame;
		
		public mouseMotion(JFrame frame){
			this.frame = frame;
		}
		
		@Override
		public void mouseMoved(MouseEvent e) {
			
			frame.setForeground(Color.YELLOW);
		}
		
	}*/
}
