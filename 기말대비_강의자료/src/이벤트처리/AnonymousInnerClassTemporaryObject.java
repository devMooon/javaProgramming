package �̺�Ʈó��;

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
		frame = new JFrame("�͸���Ŭ���� �ӽð�ü ����");
		
		buildGUI();
		
		frame.setBounds(500, 300, 200, 100);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {
		frame.setLayout(new BorderLayout());
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		textField = new JTextField(10);
		JButton button = new JButton("Ȯ��");
		
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
		
		label = new JLabel("�̸��� �Է��ϼ���.");
		
		frame.add(panel, BorderLayout.NORTH);
		frame.add(label, BorderLayout.SOUTH);
	}
}
