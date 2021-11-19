package 기본컴포넌트;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextAreaEX extends JFrame {
	private JTextArea textArea;
	public JTextAreaEX() {
		super("텍스트 영역 만들기");
		
		buildGUI();
		
		this.setBounds(500, 300, 300, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		//Container c = this.getContentPane();
		//c.setLayout(new FlowLayout());
		this.setLayout(new FlowLayout());
		JLabel label = new JLabel("입력 후 <Enter>키를 입력하세요.");
		JTextField textField = new JTextField(30);
		textArea = new JTextArea(10, 30);
		
		textField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField text = (JTextField)e.getSource();
				textArea.append(text.getText() + "\n");
				text.setText("");
			}
			
		});
		//textArea.setEnabled(false);
		
		//c.add(label);
		//c.add(textField);
		//c.add(textArea);
		
		this.add(label);
		this.add(textField);
		this.add(textArea);
		
		
	}
}
