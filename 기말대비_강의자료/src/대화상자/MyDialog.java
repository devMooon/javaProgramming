package 대화상자;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyDialog extends JFrame {
	private JDialog dialog = new JDialog(this, "Test Dialog", true);
	private JTextField textField = new JTextField(10);
	JButton btn;
	
	public MyDialog() {
		super("대화상자 연습");
		
		btn = new JButton("dialogEX 예제 프레임");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
				JButton button = new JButton("OK");
				
				button.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						dialog.setVisible(false);
					}
					
				});
				
				panel.add(textField);
				panel.add(button);
				
				dialog.add(panel);
				
				dialog.setSize(200, 100);
				dialog.setVisible(true);
				
				if(textField.getText() != null) {
					btn.setText(textField.getText());
				}
				else {
					btn.setText("입력 없음");
				}
			}
		});
		
		this.add(btn);
		this.setSize(300,  300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
