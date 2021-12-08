package ppt.comboboxEX;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ComboBoxEX extends JFrame {
	private Vector<PhoneInfo> comboBoxData;
	private JComboBox<PhoneInfo> comboBox;
	private JTextField nameField;
	private JTextField phoneNumField;
	
	public ComboBoxEX() {
		super("�޺��ڽ� �߰� ����");
		
		setData();
		buildGUI();
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void setData() {
		comboBoxData = new Vector<PhoneInfo>();
		comboBoxData.add(new PhoneInfo("ȫ�浿", "010-000-0001"));
		comboBoxData.add(new PhoneInfo("��浿", "010-000-0002"));
		comboBoxData.add(new PhoneInfo("���浿", "010-000-0003"));
		comboBoxData.add(new PhoneInfo("�̱浿", "010-000-0004"));
		comboBoxData.add(new PhoneInfo("�ڱ浿", "010-000-0005"));
		comboBoxData.add(new PhoneInfo("���浿", "010-000-0006"));
	}
	private void buildGUI() {
		
		this.add(inputForm(), BorderLayout.NORTH);
		this.add(createComboBox(), BorderLayout.CENTER);
		this.add(buttons(), BorderLayout.SOUTH);
	}
	private JPanel inputForm() {
		JPanel panel = new JPanel();
		
		JLabel label1 = new JLabel("�̸�");
		nameField = new JTextField(10);
		
		JLabel label2 = new JLabel("��ȭ��ȣ");
		phoneNumField = new JTextField(10);
		
		panel.add(label1);
		panel.add(nameField);
		panel.add(label2);
		panel.add(phoneNumField);
		
		return panel;
	}
	private JPanel createComboBox() {
		JPanel panel = new JPanel(new FlowLayout());
		comboBox = new JComboBox<PhoneInfo>(comboBoxData);
		comboBox.setMaximumRowCount(5);
		
		panel.add(comboBox);
		return panel;
	}
	private JPanel buttons() {
		JPanel panel = new JPanel(new FlowLayout());
		
		JButton addBtn = new JButton("Add");
		JButton delBtn = new JButton("Delete");
		
		addBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!nameField.getText().equals("") && !phoneNumField.getText().equals("")) {
					String name = nameField.getText();
					nameField.setText("");
					String phoneNum = phoneNumField.getText();
					phoneNumField.setText("");
					
					comboBoxData.add(new PhoneInfo(name, phoneNum));
				}
				else {
					JOptionPane.showMessageDialog(ComboBoxEX.this, "������ ��� �Էµ��� �ʾҽ��ϴ�.", "�Է� ����", JOptionPane.WARNING_MESSAGE);
				}
				
			}
			
		});
		delBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PhoneInfo p = (PhoneInfo)comboBox.getSelectedItem();
				int pNum = comboBox.getSelectedIndex();
				int result = JOptionPane.showConfirmDialog(ComboBoxEX.this, 
						"\"" + p.toString() + "\"�� ���� �Ͻðڽ��ϱ�?", 
						"����", JOptionPane.YES_NO_OPTION);
				
				if(result == JOptionPane.YES_OPTION) {
					comboBox.setSelectedItem(null);
					comboBoxData.remove(pNum);
				}
				
			}
			
		});
		
		panel.add(addBtn);
		panel.add(delBtn);
		
		return panel;
		
	}
}
