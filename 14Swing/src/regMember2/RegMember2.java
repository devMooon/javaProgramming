package regMember2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RegMember2 extends JFrame {
	JTextField nameText;
	JRadioButton genderRadioButton1;
	JRadioButton genderRadioButton2;
	JTextField residentNumText;
	JTextField departmentText;
	JCheckBox check1;
	JCheckBox check2;
	JCheckBox check3;
	JCheckBox check4;
	
	
	JLabel introduceLabel;
	JTextArea introduceTextArea;
	
	
	public RegMember2(){
		super("��� ���");
		
		buildGUI();
		
		this.setSize(350, 420);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void buildGUI() {
		JPanel p = makePanel();

		this.add(p);	
	}
	
	private JPanel makePanel() {
		JPanel p = new JPanel(new GridLayout(2, 1));
		
		p.add(makeGrid());
		p.add(makeBorder());
		
		return p;
	}
	private JPanel makeGrid() {
		JPanel p = new JPanel(new GridLayout(5, 1));
		
		p.add(createNameAndGender());
		p.add(createResidentNum());
		p.add(createAddress());
		p.add(createDepartment());
		p.add(createHobby());
		
		return p;
	}
	
	private JPanel makeBorder() {
		JPanel p = new JPanel(new BorderLayout());
		
		p.add(createIntroduce(), BorderLayout.CENTER);
		p.add(createButtons(), BorderLayout.SOUTH);
		
		return p;
	}
	
	
	
	private JPanel createNameAndGender() {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel nameLabel = new JLabel("��               ��");
		nameText = new JTextField(8);
		JLabel genderLabel = new JLabel("��               ��");
		
		genderRadioButton1 = new JRadioButton("��");
		genderRadioButton2 = new JRadioButton("��");
		
		ButtonGroup group = new ButtonGroup();
		group.add(genderRadioButton1);
		group.add(genderRadioButton2);
		
		p.add(nameLabel);
		p.add(nameText);
		p.add(genderLabel);
		p.add(genderRadioButton1);
		p.add(genderRadioButton2);
		
		return p;
		
	}
	private JPanel createResidentNum(){
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label1 = new JLabel("�ֹε�Ϲ�ȣ");
		residentNumText = new JTextField(6);
		JLabel label2 = new JLabel("-");
		JTextField text2 = new JTextField(7);
		
		p.add(label1);
		p.add(residentNumText);
		p.add(label2);
		p.add(text2);
		
		return p;
	}
	private JPanel createAddress() {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label = new JLabel("��               ��");
		JTextField text = new JTextField(22);
		
		p.add(label);
		p.add(text);
		
		return p;
	}
	private JPanel createDepartment() {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
	
		JLabel label = new JLabel("��      ��      ��");
		departmentText = new JTextField(8);
		
		p.add(label);
		p.add(departmentText);
		
		return p;
	}
	private JPanel createHobby() {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label = new JLabel("��               ��");
		check1 = new JCheckBox("��ȭ");
		check2 = new JCheckBox("���ǰ���");
		check3 = new JCheckBox("����");
		check4 = new JCheckBox("�");

		p.add(label);
		p.add(check1);
		p.add(check2);
		p.add(check3);
		p.add(check4);
		
		return p;
	}
	
	private JPanel createIntroduce(){
		JPanel p = new JPanel(new BorderLayout());
		
		introduceLabel = new JLabel("��  ��  ��  ��");
		introduceTextArea = new JTextArea(9, 22);
		
		p.add(introduceLabel, BorderLayout.NORTH);
		p.add(introduceTextArea, BorderLayout.CENTER);
		
		return p;
	}
	private JPanel createButtons() {
		JPanel p = new JPanel(new FlowLayout());
		
		JButton b1 = new JButton("����");
		JButton b2 = new JButton("����");
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StringBuffer stringBuffer = new StringBuffer();
				
				if(!nameText.getText().equals("")) {
					stringBuffer.append("�� �̸��� ");
					stringBuffer.append(nameText.getText());
					stringBuffer.append("�Դϴ�.");
					stringBuffer.append("\n");
				}
				
				if(genderRadioButton1.isSelected() || genderRadioButton2.isSelected()) {
					stringBuffer.append("������ ");
					
					if(genderRadioButton1.isSelected()) stringBuffer.append("����");
					if(genderRadioButton2.isSelected()) stringBuffer.append("����");
					stringBuffer.append("�Դϴ�.");
					stringBuffer.append("\n");
				}
				
				if(!residentNumText.getText().equals("")) {
					stringBuffer.append("�ֹε�Ϲ�ȣ�� ");					
					stringBuffer.append(residentNumText.getText());
					stringBuffer.append("�Դϴ�.");
					stringBuffer.append("\n");
				}
				
				if(!departmentText.getText().equals("")) {
					stringBuffer.append("�μ����� ");					
					stringBuffer.append(departmentText.getText());
					stringBuffer.append("�Դϴ�.");
					stringBuffer.append("\n");
				}
				
				if(check1.isSelected() || check2.isSelected() || check3.isSelected() || check4.isSelected()) {
					stringBuffer.append("��̴� ");
					
					if(check1.isSelected()) stringBuffer.append("��ȭ,   ");
					if(check2.isSelected()) stringBuffer.append("���ǰ���,   ");
					if(check3.isSelected()) stringBuffer.append("����,   ");
					if(check4.isSelected()) stringBuffer.append("�  ");
					
					stringBuffer.append("�Դϴ�.");
					stringBuffer.append("\n");
				}
				
				
				String string = stringBuffer.toString();
				introduceTextArea.append(string);
				
			}
			
		});
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
				
			}
			
		});
		
		p.add(b1);
		p.add(b2);
		
		return p;
	}
}
