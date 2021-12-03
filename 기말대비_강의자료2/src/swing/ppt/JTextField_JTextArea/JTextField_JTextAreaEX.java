package swing.ppt.JTextField_JTextArea;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextField_JTextAreaEX extends JFrame {
	private JTextArea textArea;
	
	public JTextField_JTextAreaEX() {
		super("텍스트 영역 만들기");
		
		buildGUI();
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		this.setLayout(new FlowLayout());
		
		this.add(buildJPanel());
	}
	private JPanel buildJPanel() {
		JPanel panel = new JPanel(new BorderLayout());
		
		panel.add(buildJTextField(), BorderLayout.NORTH);
		panel.add(buildJTextArea(), BorderLayout.CENTER);
		
		return panel;		
	}
	private JPanel buildJTextField() {
		JPanel panel = new JPanel(new GridLayout(0, 1));
		
		JLabel label = new JLabel("입력 후 <Enter> 키를 입력하세요");
		JTextField textField = new JTextField(22);
		textField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String msg = ((JTextField)e.getSource()).getText();
				textArea.setText(msg);
			}
			
		});
		panel.add(label);
		panel.add(textField);
		
		return panel;
	}
	private JPanel buildJTextArea() {
		JPanel panel = new JPanel(new FlowLayout());
		
		textArea = new JTextArea(9, 22);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		
		panel.add(new JScrollPane(textArea));
		
		return panel;
	}
}
