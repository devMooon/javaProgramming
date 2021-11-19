package �⺻������Ʈ;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextFieldEX  extends JFrame {
	
	public JTextFieldEX() {
		super("JTextField �����Դϴ�.");
		
		buildGUI();
		
		this.setBounds(500, 300, 200, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI(){
		this.setLayout(new GridLayout(3, 1));
		
		this.add(createRow("�̸�", "", 15));
		this.add(createRow("�а�", "��ǻ�Ͱ��а�", 15));
		this.add(createRow("�ּ�", "����� ...", 15));
		
	}
	private JPanel createRow(String labelName, String defaultText, int size) {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		JLabel label = new JLabel(labelName);
		JTextField textField = new JTextField(defaultText, size);
		
		panel.add(label);
		panel.add(textField);
		
		return panel;
	}
}
