package swing.hw.layoutManager;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LayoutEX extends JFrame {
	//makeIDF_r_1
	private JTextField name;
	private JRadioButton genderXX;
	private JRadioButton genderXY;
	//makeIDF_r_2
	private JTextField FrontRRNumber;
	private JTextField BackRRNumber;
	//makeIDF_r_3
	private JTextField address;
	//makeIDF_r_4
	private Vector<String> v = new Vector<String>();
	private JComboBox<String> combo;
	//makeIDF_r_5
	private JTextField hobby;
	//makeAboutMeForm
	JTextArea textArea;
	JButton inputBtn;
	JButton saveBtn;
	JButton exitBtn;
	
	public LayoutEX() {
		super("사원 등록");
		
		addDepartment();
		buildGUI();
		
		this.setSize(350, 420);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void addDepartment() {
		v.add("회계부");
		v.add("마케팅부");
		v.add("전산부");
		v.add("기획부");
	}
	private void buildGUI() {
		this.setLayout(new GridLayout(2, 1));
		this.add(makeInputDataForm());
		this.add(makeAboutMeForm());
		
	}
	private JPanel makeInputDataForm() {
		JPanel panel = new JPanel(new GridLayout(0, 1));
		
		panel.add(makeIDF_r_1());
		panel.add(makeIDF_r_2());
		panel.add(makeIDF_r_3());
		panel.add(makeIDF_r_4());
		panel.add(makeIDF_r_5());
		
		return panel;
	}
	private JPanel makeIDF_r_1() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label1 = new JLabel("성                명");
		name = new JTextField(8);
		JLabel label2 = new JLabel("성         별");
		genderXX = new JRadioButton("여자");
		genderXY = new JRadioButton("남자");
		
		ButtonGroup buttons = new ButtonGroup();
		buttons.add(genderXX);
		buttons.add(genderXY);
		
		panel.add(label1);
		panel.add(name);
		panel.add(label2);
		panel.add(genderXX);
		panel.add(genderXY);
		
		return panel;
	}
	private JPanel makeIDF_r_2() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel Label1 = new JLabel("주민등록번호 ");
		FrontRRNumber = new JTextField(8);
		JLabel Label2 = new JLabel(" - ");
		BackRRNumber = new JTextField(8);
		
		panel.add(Label1);
		panel.add(FrontRRNumber);
		panel.add(Label2);
		panel.add(BackRRNumber);
		
		return panel;
	}
	private JPanel makeIDF_r_3() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel Label = new JLabel("주                소");
		address = new JTextField(22);
		
		panel.add(Label);
		panel.add(address);
		
		return panel;
	}
	private JPanel makeIDF_r_4() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel Label = new JLabel("부      서      명");
		
		combo = new JComboBox<String>(v);
		combo.setMaximumRowCount(3);
		
		panel.add(Label);
		panel.add(combo);
		
		return panel;
	}
	private JPanel makeIDF_r_5() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel Label = new JLabel("취                미");
		hobby = new JTextField(22);
		
		panel.add(Label);
		panel.add(hobby);
		
		return panel;
	}
	private JPanel makeAboutMeForm() {
		JPanel panel = new JPanel(new BorderLayout());
		
		JLabel label = new JLabel("자  기  소  개");
		textArea = new JTextArea();
		
		panel.add(label, BorderLayout.NORTH);
		panel.add(textArea, BorderLayout.CENTER);
		panel.add(makeButtons(), BorderLayout.SOUTH);
		
		return panel;
	}
	private JPanel makeButtons() {
		JPanel panel = new JPanel(new FlowLayout());
		
		inputBtn = new JButton("입력");
		saveBtn = new JButton("저장");
		exitBtn = new JButton("종료");
		
		inputBtn.addActionListener(inputDataEventListener);
		saveBtn.addActionListener(saveDataEventListener);
		
		exitBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		});
		
		panel.add(inputBtn);
		panel.add(saveBtn);
		panel.add(exitBtn);
		
		return panel;
	}
	private ActionListener inputDataEventListener = new ActionListener() {
		private StringBuffer sb = new StringBuffer();
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(name.getText().trim().length() != 0) {
				sb.append("이름: " + name.getText() + "\n");
				name.setText("");
			}
			if(genderXX.isSelected()) sb.append("성별: " + genderXX.getText() + "\n");
			if(genderXY.isSelected()) sb.append("성별: " + genderXY.getText() + "\n");
			if(FrontRRNumber.getText().trim().length() != 0 
					&& BackRRNumber.getText().trim().length() != 0) {
				sb.append("주민번호: " + FrontRRNumber.getText() + " - " + BackRRNumber.getText() + "\n");
				FrontRRNumber.setText("");
				BackRRNumber.setText("");
			}
			if(address.getText().trim().length() != 0) {
				sb.append("주소: " + address.getText() + "\n");
				address.setText("");
			}
			sb.append("부서명: " + combo.getSelectedItem().toString() + "\n");
			if(hobby.getText().trim().length() != 0) {
				sb.append("취미: " + hobby.getText() + "\n");
				hobby.setText("");
			}
			
			String string = sb.toString();
			textArea.setText("");
			textArea.setText(string);
		}
	};
	private ActionListener saveDataEventListener = new ActionListener() {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				fw = new FileWriter("사원 정보.txt");
				bw = new BufferedWriter(fw);
				
				String[] strings = textArea.getText().split("\n");
				
				for(int i = 0; i < strings.length; i++) {
					bw.write(strings[i]);
					bw.newLine();
				}
				textArea.setText("저장 완료");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
			finally {
					try {
						if(bw != null) bw.close();
						if(fw != null) fw.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
			}
			
			
		}
		
	};
}
