package 대화상자;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DialogEX extends JFrame {
	private JButton inputDialogBtn;
	private JButton confirmDialogBtn;
	private JButton messageDialogBtn;
	private JTextField text;
	public DialogEX() {
		super("JOptionPane 연습입니다.");
		
		buildGUI();
		
		this.setSize(600, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		JPanel panel = new JPanel(new FlowLayout());
		
		inputDialogBtn = new JButton("InputDialog");
		confirmDialogBtn = new JButton("ConfirmDialog");
		messageDialogBtn = new JButton("MessageDialog");
		inputDialogBtn.addActionListener(DialogActionListener);
		confirmDialogBtn.addActionListener(DialogActionListener);
		messageDialogBtn.addActionListener(DialogActionListener);
		
		text = new JTextField(20);
		
		panel.add(inputDialogBtn);
		panel.add(confirmDialogBtn);	
		panel.add(messageDialogBtn);
		panel.add(text); 
		
		this.add(panel);
	}
	
	private ActionListener DialogActionListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == inputDialogBtn) {
				String string = JOptionPane.showInputDialog(DialogEX.this, "What your name?", "get Name", JOptionPane.QUESTION_MESSAGE);
				
				if(string == null) return;
				else text.setText("Your name is " + string + ".");
			}
			if(e.getSource() == confirmDialogBtn) {
				int select = JOptionPane.showConfirmDialog(DialogEX.this, "Are you sure?", "Confirm", JOptionPane.YES_NO_OPTION);
				
				if(select == JOptionPane.YES_OPTION) text.setText("Yes");
				else if(select == JOptionPane.NO_OPTION) text.setText("No");
				else text.setText("X");
			}
			if(e.getSource() == messageDialogBtn) {
				JOptionPane.showMessageDialog(DialogEX.this, "Waring!", "warn", JOptionPane.WARNING_MESSAGE);
			}
			
		}
		
	};
}
