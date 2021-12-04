package swing.ppt.JListEx;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListEX2 extends JFrame {
	private JTextField textField;
	private Vector<String> data;
	private JList list;
	public JListEX2() {
		super("����Ʈ�� �� �߰�, ���� ����");
		
		makeData();
		buildGUI();
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void makeData() {
		data = new Vector<String>();
		data.add("apple");
		data.add("banana");
		data.add("cherry");
	}
	private void buildGUI() {
		this.setLayout(new BorderLayout());
		
		this.add(makeJPanel_1(), BorderLayout.CENTER);
		this.add(makeJPanel_2(), BorderLayout.SOUTH);
	}
	private JPanel makeJPanel_1() {
		JPanel panel = new JPanel(new FlowLayout());
		
		textField = new JTextField(15);
		list = new JList<String>(data);
	
		textField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				data.add(textField.getText());
				textField.setText("");
				list.updateUI();
				
			}
			
		});
		list.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(e.getValueIsAdjusting()) {
					int idx = e.getFirstIndex();
					System.out.println(idx);
					
					textField.setText((String) list.getSelectedValue());
				}
				//textField.setText(((JList)e.getSource()).getSelectedValue().toString());
				
			}
			
		});
		panel.add(textField);
		panel.add(new JScrollPane(list));
		
		return panel;
	}
	private JPanel makeJPanel_2() {
		JPanel panel = new JPanel(new FlowLayout());
		
		JButton addBtn = new JButton("�߰�");
		JButton delBtn = new JButton("����");
		
		addBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().trim().length() != 0) {
					data.add(textField.getText());
					textField.setText("");
					list.updateUI();
				}
				else {
					JOptionPane.showMessageDialog(JListEX2.this, "�߰��� ���� �Է� ���ּ���.", "����", JOptionPane.WARNING_MESSAGE);
						
				}
				
			}
			
		});
		
		delBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!list.isSelectionEmpty()) {
					try {
						data.remove(list.getSelectedIndex());
						list.setSelectedIndex(0);
						textField.setText("");
						list.updateUI();
					} catch(ArrayIndexOutOfBoundsException e1){
						JOptionPane.showMessageDialog(JListEX2.this, "����Ʈ�� ������ ���� �����ϴ�.", "����", JOptionPane.WARNING_MESSAGE);
						
					}
				}
				else {
					JOptionPane.showMessageDialog(JListEX2.this, "����Ʈ���� ������ ���� ���� ���ּ���.", "����", JOptionPane.WARNING_MESSAGE);
					
				}
				
				
			}
			
		});
		panel.add(addBtn);
		panel.add(delBtn);
		
		return panel;
	}
}
