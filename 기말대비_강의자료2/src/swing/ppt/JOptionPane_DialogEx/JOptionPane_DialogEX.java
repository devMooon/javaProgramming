package swing.ppt.JOptionPane_DialogEx;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPane_DialogEX extends JFrame {
	public JOptionPane_DialogEX() {
		super("다이얼로그 예제");
		
		buildGUI();
		
		this.setSize(400, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		this.setLayout(new FlowLayout());
		JButton messageDialogBtn = new JButton("Message Dialog");
		JButton confirmDialogBtn = new JButton("Confirm Dialog");
		JButton inputDialogBtn = new JButton("Input Dialog");
		
		messageDialogBtn.addActionListener(messageDialogListener);
		confirmDialogBtn.addActionListener(confirmDialoListener);
		inputDialogBtn.addActionListener(inputDialogListener);
		
		this.add(messageDialogBtn);
		this.add(confirmDialogBtn);
		this.add(inputDialogBtn);
	}
	private ActionListener messageDialogListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(JOptionPane_DialogEX.this, "현재 12시 10분입니다.", "시간 알림", JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	};
	private ActionListener confirmDialoListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(JOptionPane_DialogEX.this, "친구 수락을 하시겠습니까?", "친구 요청", JOptionPane.YES_NO_OPTION);
			
			if(result == JOptionPane.YES_OPTION) System.out.println("친구 요청을 수락 했습니다.");
			else System.out.println("친구 요청을 거절 했습니다.");
		}
		
	};
	private ActionListener inputDialogListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String name = JOptionPane.showInputDialog(JOptionPane_DialogEX.this, "이름을 입력 하세요.", "이름", JOptionPane.QUESTION_MESSAGE);
			
			if (name != null) JOptionPane_DialogEX.this.setTitle(name);
			else JOptionPane_DialogEX.this.setTitle("제목");
		}
		
	};
}
