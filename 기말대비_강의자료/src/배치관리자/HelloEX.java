package 배치관리자;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HelloEX {
	private JFrame frame;
	private JTextField textFeild;
	private JLabel label;
	
	public HelloEX() {
		frame = new JFrame("HelloEX");
		
		buildGUI();
		
		frame.setBounds(500, 300, 200, 80);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {
		JPanel panel = new JPanel(new BorderLayout());
		
		textFeild = new JTextField();
		JButton button = new JButton("확인");
		label = new JLabel("검색어를 입력해보세요.");
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(textFeild.getText());				
			}
			
		});
		
		panel.add(textFeild, BorderLayout.CENTER);
		panel.add(button, BorderLayout.EAST);
		panel.add(label, BorderLayout.SOUTH);
		
		frame.add(panel);
	}
}
