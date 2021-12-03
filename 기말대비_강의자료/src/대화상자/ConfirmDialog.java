package 대화상자;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConfirmDialog extends JFrame {
	public ConfirmDialog() {
		super("대화상자 연습");
		
		buildGUI();
		
		this.setBounds(500, 300, 200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		this.setLayout(new FlowLayout());
		JButton button = new JButton("HI");
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(ConfirmDialog.this, "확인하세요", "확인", JOptionPane.YES_NO_OPTION);
				
			}
			
		});
		
		this.add(button);
	}
}
