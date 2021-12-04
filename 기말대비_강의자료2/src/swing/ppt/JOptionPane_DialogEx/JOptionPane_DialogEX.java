package swing.ppt.JOptionPane_DialogEx;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPane_DialogEX extends JFrame {
	public JOptionPane_DialogEX() {
		super("���̾�α� ����");
		
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
			JOptionPane.showMessageDialog(JOptionPane_DialogEX.this, "���� 12�� 10���Դϴ�.", "�ð� �˸�", JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	};
	private ActionListener confirmDialoListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(JOptionPane_DialogEX.this, "ģ�� ������ �Ͻðڽ��ϱ�?", "ģ�� ��û", JOptionPane.YES_NO_OPTION);
			
			if(result == JOptionPane.YES_OPTION) System.out.println("ģ�� ��û�� ���� �߽��ϴ�.");
			else System.out.println("ģ�� ��û�� ���� �߽��ϴ�.");
		}
		
	};
	private ActionListener inputDialogListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String name = JOptionPane.showInputDialog(JOptionPane_DialogEX.this, "�̸��� �Է� �ϼ���.", "�̸�", JOptionPane.QUESTION_MESSAGE);
			
			if (name != null) JOptionPane_DialogEX.this.setTitle(name);
			else JOptionPane_DialogEX.this.setTitle("����");
		}
		
	};
}
