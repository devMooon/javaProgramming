package 파일입출력;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import java.util.jar.JarOutputStream;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EmployeeRegistrationForm extends JFrame {
	private StringBuffer stringBuffer = new StringBuffer();
	//row_1
	private JTextField nameJTextField;
	private JRadioButton radioBtn1;
	private JRadioButton radioBtn2;
	//row_2
	private JTextField residentNumJTextField1;
	private JTextField residentNumJTextField2;
	//row_3
	private Vector<String> vector;
	private JComboBox<String> combobox;
	//row_4
	private JTextField addressJTextField;
	//row_5
	private JTextField hobbyJTextField;
	//row_6
	private JTextArea aboutMe;
	//row_7
	private JButton saveButton;
	private JButton closeButton;
	
	public EmployeeRegistrationForm() {
		super("사원 등록");
		
		addVector();
		buildGUI();
		
		this.setSize(350, 420);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void addVector() {
		vector = new Vector<String>();
		 
		vector.add("회계부");
		vector.add("인사담당부");
		vector.add("마케팅부");
		vector.add("기획부");
	}
	private void buildGUI() {
		this.add(buildGrid(), BorderLayout.NORTH);
		this.add(buildBorder(), BorderLayout.CENTER);
	}
	private JPanel buildGrid() {
		JPanel panel = new JPanel(new GridLayout(5, 1));
		
		panel.add(row_1());
		panel.add(row_2());
		panel.add(row_3());
		panel.add(row_4());
		panel.add(row_5());
		
		return panel;
	}
	private JPanel buildBorder() {
		JPanel panel = new JPanel(new BorderLayout(5, 1));
		
		panel.add(row_6(), BorderLayout.CENTER);
		panel.add(row_7(), BorderLayout.SOUTH);
		
		return panel;
	}
	
	private JPanel row_1() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		nameJTextField = new JTextField(8);
		radioBtn1 = new JRadioButton("여자");
		radioBtn2 = new JRadioButton("남자");
		
		nameJTextField.addActionListener(makeListener);
		radioBtn1.addActionListener(makeListener);
		radioBtn2.addActionListener(makeListener);
		
		ButtonGroup radios = new ButtonGroup();
		radios.add(radioBtn1);
		radios.add(radioBtn2);
		
		panel.add(new JLabel("성              명"));
		panel.add(nameJTextField);
		panel.add(new JLabel("성       별"));
		panel.add(radioBtn1);
		panel.add(radioBtn2);
		
		return panel;
	}
	private JPanel row_2() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label1 = new JLabel("주민등록번호");
		residentNumJTextField1 = new JTextField(6);
		JLabel label2 = new JLabel(" - ");
		residentNumJTextField2 = new JTextField(7);
		
		residentNumJTextField2.addActionListener(makeListener);
		
		panel.add(label1);
		panel.add(residentNumJTextField1);
		panel.add(label2);
		panel.add(residentNumJTextField2);
		
		return panel;
	}
	private JPanel row_3() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label = new JLabel("부     서     명");
		combobox = new JComboBox<String>(vector);
		combobox.setMaximumRowCount(3);
		
		combobox.addActionListener(makeListener);
		
		panel.add(label);
		panel.add(combobox);
		
		return panel;
	}
	private JPanel row_4() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label = new JLabel("주              소");
		addressJTextField = new JTextField(22);
		
		addressJTextField.addActionListener(makeListener);
		
		panel.add(label);
		panel.add(addressJTextField);
		
		return panel;
	}
	private JPanel row_5() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label = new JLabel("취              미");
		hobbyJTextField = new JTextField(22);
		
		hobbyJTextField.addActionListener(makeListener);
		
		panel.add(label);
		panel.add(hobbyJTextField);
		
		return panel;
	}
	private JPanel row_6() {
		JPanel panel = new JPanel(new BorderLayout());
		
		JLabel label = new JLabel("자   기   소   개");
		aboutMe = new JTextArea(9, 22);
		
		panel.add(label, BorderLayout.NORTH);
		panel.add(aboutMe, BorderLayout.CENTER);
		
		return panel;
	}
	private JPanel row_7(){
		JPanel panel = new JPanel(new FlowLayout());
		
		saveButton = new JButton("저장");
		closeButton = new JButton("종료");
		
		saveButton.addActionListener(new ActionListener() {
			FileWriter fw = null;
			BufferedWriter bw = null;	
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					fw = new FileWriter("사원 자기소개.txt");
					bw = new BufferedWriter(fw);
					
					String[] array = stringBuffer.toString().split("\n");
					
					for(int i = 0; i < array.length; i++) {
						bw.write(array[i]);
						bw.newLine();
					}
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					System.out.println(bw);
					e1.printStackTrace();
				}
				finally {
					try {
						if(bw != null) bw.close();
						if(fw != null) fw.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					aboutMe.setText("저장 완료");
					nameJTextField.setText("");
					residentNumJTextField1.setText("");
					residentNumJTextField2.setText("");
					addressJTextField.setText("");
					hobbyJTextField.setText("");
				}
			}
			
		});
		closeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		});
		
		panel.add(saveButton);
		panel.add(closeButton);
		
		return panel;
	}
	private void makeAboutMe() {
		if(!stringBuffer.isEmpty()) {
			stringBuffer.setLength(0);
		}
		if(nameJTextField.getText().trim().length()!=0) {
			stringBuffer.append("제 이름은 ");
			stringBuffer.append(nameJTextField.getText());
			stringBuffer.append("입니다.\n");
		}
		if(radioBtn1.isSelected()) {
			stringBuffer.append("저는 여자입니다.\n");
		}
		if(radioBtn2.isSelected()) {
			stringBuffer.append("저는 남자입니다.\n");
		}
		if(residentNumJTextField1.getText().trim().length() != 0 && residentNumJTextField2.getText().trim().length() != 0) {
			stringBuffer.append("주민등록번호는 ");
			stringBuffer.append(residentNumJTextField1.getText());
			stringBuffer.append(" - ");
			stringBuffer.append(residentNumJTextField2.getText());
			stringBuffer.append("입니다.\n");
		}
		else {
			stringBuffer.append("!주민등록번호를 입력 해주세요!\n");
		}
		if(combobox.getSelectedIndex() >= 0 && combobox.getSelectedIndex() < vector.size()) {
			stringBuffer.append("저는 ");
			stringBuffer.append(combobox.getSelectedItem().toString());
			stringBuffer.append("에서 일합니다.\n");
		}
		if(addressJTextField.getText().trim().length() != 0) {
			stringBuffer.append("저는 ");
			stringBuffer.append(addressJTextField.getText());
			stringBuffer.append("에 거주합니다.\n");
		}
		if(hobbyJTextField.getText().trim().length() != 0) {
			stringBuffer.append("저는 ");
			stringBuffer.append(hobbyJTextField.getText());
			stringBuffer.append("를 좋아합니다.\n");
		}
		
		String text = stringBuffer.toString();
		aboutMe.setText(text);
	}
	private ActionListener makeListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			EmployeeRegistrationForm.this.makeAboutMe();
			
		}
	};
}
