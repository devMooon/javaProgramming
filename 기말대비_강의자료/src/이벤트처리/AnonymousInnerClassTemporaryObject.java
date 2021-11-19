package 이벤트처리;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AnonymousInnerClassTemporaryObject {
	private JFrame frame;
	private JTextField textField;
	private JLabel label;
	
	public AnonymousInnerClassTemporaryObject() {
		frame = new JFrame("익명내부클래스 임시객체 연습");
		
		buildGUI();
		
		frame.setBounds(500, 300, 200, 100);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {
		frame.setLayout(new BorderLayout());
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		textField = new JTextField(10);
		JButton button = new JButton("확인");
		
		textField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(textField.getText() + " Hello!");
			}
			
		});
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(textField.getText() + " Hello!");
			}
			
		});
		
		panel.add(textField);
		panel.add(button);
		
		label = new JLabel("이름을 입력하세요.");
		
		frame.add(panel, BorderLayout.NORTH);
		frame.add(label, BorderLayout.SOUTH);
	}
}
