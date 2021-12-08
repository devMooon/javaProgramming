package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class EmployeeRegistrationForm extends JFrame {
	//row_1
	private JTextField name;
	private JRadioButton ladio_1;
	private JRadioButton ladio_2;
	//row_2
	private JTextField securityNum_front;
	private JTextField securityNum_back;
	//row_3
	private JTextField address;
	//row_4
	private JComboBox<String> department;
	private Vector<String> departmentData;
	//row_5
	private JCheckBox checkbox1;
	private JCheckBox checkbox2;
	private JCheckBox checkbox3;
	private JCheckBox checkbox4;
	//textArea
	private JTextArea textArea;
	
	public EmployeeRegistrationForm() {
		super("��� ���");
		
		setData();
		buildGUI();
		
		this.setSize(350, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void setData() {
		departmentData = new Vector<String>();
		departmentData.add("��ȹ��");
		departmentData.add("ȫ����");
		departmentData.add("�����ú�");
		departmentData.add("���ߺ�");
		departmentData.add("�����κ�");
	}
	private void buildGUI() {
		this.setLayout(new BorderLayout());
		this.setJMenuBar(createJMenuBar());
		this.add(createJPanel1(), BorderLayout.NORTH);
		this.add(createJPanel2(), BorderLayout.CENTER);		
	}
	
	private JMenuBar createJMenuBar() {
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("Option");
		JMenuItem saveItem = new JMenuItem("Save");
		JMenuItem exitItem = new JMenuItem("Exit");
		
		saveItem.addActionListener(saveItemHandler);
		exitItem.addActionListener(exitItemHandler);
		
		menubar.add(menu);
		menu.add(saveItem);
		menu.addSeparator();
		menu.add(exitItem);
		
		return menubar;
	}
	private JPanel createJPanel1() {
		JPanel panel = new JPanel(new GridLayout(6, 1));
		
		panel.add(createGrid_row1());
		panel.add(createGrid_row2());
		panel.add(createGrid_row3());
		panel.add(createGrid_row4());
		panel.add(createGrid_row5());
		
		return panel;
	}
	
	private JPanel createJPanel2() {
		JPanel panel = new JPanel(new BorderLayout());
		
		panel.add(createIntroduce(), BorderLayout.NORTH);
		panel.add(createTextArea(), BorderLayout.CENTER);
		
		return panel;
	}
	
	private JPanel createGrid_row1() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label1 = new JLabel("��               ��");
		name = new JTextField(8);
		
		JLabel label2 = new JLabel("��      ��");
		ladio_1 = new JRadioButton("����");
		ladio_2 = new JRadioButton("����");
		
		ButtonGroup btngrp = new ButtonGroup();
		btngrp.add(ladio_1);
		btngrp.add(ladio_2);
		
		panel.add(label1);
		panel.add(name);
		panel.add(label2);
		panel.add(ladio_1);
		panel.add(ladio_2);
		
		return panel;
	}
	
	private JPanel createGrid_row2() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label1 = new JLabel("�ֹε�Ϲ�ȣ");
		securityNum_front = new JTextField(8);
		
		JLabel label2 = new JLabel(" - ");
		securityNum_back = new JTextField(8);
		
		panel.add(label1);
		panel.add(securityNum_front);
		panel.add(label2);
		panel.add(securityNum_back);
		
		return panel;
	}
	
	private JPanel createGrid_row3() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label1 = new JLabel("��               ��");
		address = new JTextField(22);
		
		panel.add(label1);
		panel.add(address);
		
		return panel;
	}
	
	private JPanel createGrid_row4() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label1 = new JLabel("��               ��");
		department = new JComboBox<String>(departmentData);
		department.setMaximumRowCount(3);
		
		panel.add(label1);
		panel.add(department);
		
		return panel;
	}
	
	private JPanel createGrid_row5() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label1 = new JLabel("��               ��");
		checkbox1 = new JCheckBox("��ȭ");
		checkbox2 = new JCheckBox("���ǰ���");
		checkbox3 = new JCheckBox("����");
		checkbox4 = new JCheckBox("�");
		
		panel.add(label1);
		panel.add(checkbox1);
		panel.add(checkbox2);
		panel.add(checkbox3);
		panel.add(checkbox4);
		
		return panel;
	}
	
	private JPanel createIntroduce() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label1 = new JLabel("��   ��   ��   ��");
		
		panel.add(label1);
		
		return panel;
	}
	
	private JPanel createTextArea() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		textArea = new JTextArea(9, 35);
		
		panel.add(textArea);
		
		return panel;
	}
	
	private ActionListener saveItemHandler = new ActionListener() {
		private FileWriter fw = null;
		private BufferedWriter bw = null;
		
		private boolean isRight() {
			//row_1
			if(name.getText().equals("")) {
				JOptionPane.showMessageDialog(EmployeeRegistrationForm.this, "�̸��� �Է� ���ּ���!", "�Է� ����", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			else if(!ladio_1.isSelected() && !ladio_2.isSelected()) {
				JOptionPane.showMessageDialog(EmployeeRegistrationForm.this, "������ ���� ���ּ���!", "�Է� ����", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			//row_2
			else if(securityNum_front.getText().equals("") || securityNum_back.getText().equals("")) {
				JOptionPane.showMessageDialog(EmployeeRegistrationForm.this, "�ֹε�Ϲ�ȣ�� �ùٸ��� �Է� ���ּ���!", "�Է� ����", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			//row_3
			else if(address.getText().equals("")) {
				JOptionPane.showMessageDialog(EmployeeRegistrationForm.this, "�ּҸ� �Է� ���ּ���!", "�Է� ����", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			//row_5
			else if(!checkbox1.isSelected() && !checkbox2.isSelected() && !checkbox3.isSelected() && !checkbox4.isSelected()) {
				JOptionPane.showMessageDialog(EmployeeRegistrationForm.this, "��̸� �Ѱ� �̻� ���� ���ּ���!", "�Է� ����", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			return true;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(isRight()) {
				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("text file", "txt");
				chooser.setFileFilter(filter);
				
				int rec = chooser.showSaveDialog(EmployeeRegistrationForm.this);
				
				if(rec == JFileChooser.APPROVE_OPTION) {
					String fileName = chooser.getSelectedFile().getPath();
					
					try {
						fw = new FileWriter(fileName);
						bw = new BufferedWriter(fw);
						
						bw.write(name.getText());
						
						if(ladio_1.isSelected()) {
							bw.write(ladio_1.getActionCommand());
						}
						else {
							bw.write(ladio_2.getActionCommand());
						}
						
						bw.write(securityNum_front.getText());
						bw.write(securityNum_back.getText());
						bw.write(address.getText());
						
						Iterator<String> itr = departmentData.iterator();
						while(itr.hasNext()) {
							bw.write(itr.next());
						}
						
						if(checkbox1.isSelected()) {
							bw.write(checkbox1.getActionCommand());
						}
						else if(checkbox2.isSelected()) {
							bw.write(checkbox2.getActionCommand());
						}
						else if(checkbox3.isSelected()) {
							bw.write(checkbox3.getActionCommand());
						}
						else if(checkbox4.isSelected()) {
							bw.write(checkbox4.getActionCommand());
						}
						bw.write(textArea.getText());
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					finally {
						try {
							if(bw != null) bw.close();
							if(fw != null) fw.close();
							
							JOptionPane.showMessageDialog(EmployeeRegistrationForm.this, "���Ͽ� ���� �Ϸ�!", "����", JOptionPane.PLAIN_MESSAGE);
							
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					
				}
				else {
					JOptionPane.showMessageDialog(EmployeeRegistrationForm.this, "������ ����� ���õ��� �ʾ�, ������� �ʾҽ��ϴ�!", "���� ���� ����", JOptionPane.WARNING_MESSAGE);
				}
			}			
		}
		
	};
	
	private ActionListener exitItemHandler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			int answer = JOptionPane.showConfirmDialog(EmployeeRegistrationForm.this, 
					"�����Ͻðڽ��ϱ�?", "����", JOptionPane.YES_NO_OPTION);
			
			if(answer == JOptionPane.YES_OPTION) System.exit(-1);
		}
		
	};
}
