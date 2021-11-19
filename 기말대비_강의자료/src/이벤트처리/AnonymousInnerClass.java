package �̺�Ʈó��;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AnonymousInnerClass extends JFrame {
	private JTextField textField;
	private JLabel label;
	
	public AnonymousInnerClass() {
		super("�͸���Ŭ���� ����");
		
		buildGUI();
		
		this.setBounds(500, 300, 200, 80);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI(){
		this.setLayout(new BorderLayout());
		
		textField = new JTextField();
		JButton button = new JButton("Ȯ��");
		label = new JLabel("�̸��� �Է��ϼ���.");
		
		button.addActionListener(handeler);
		
		this.add(textField, BorderLayout.CENTER);
		this.add(button, BorderLayout.EAST);
		this.add(label, BorderLayout.SOUTH);
	}
	private ActionListener handeler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText(textField.getText() + " Hello!!");			
		}
		
	};
}
