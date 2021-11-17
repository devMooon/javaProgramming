package regMember3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RegMember3 extends JFrame {
	
	
	private JTextField nameText;
	private JRadioButton genderRadioButton1;
	private JRadioButton genderRadioButton2;
	private JTextField residentNumText1;
	private JTextField residentNumText2;
	private JTextField addressText;
	private JTextField departmentText;
	private JCheckBox[] checkbox = new JCheckBox[4];
	private String[] hobbies = {"영화", "음악감상", "사진", "운동"};
	
	
	private JLabel introduceLabel;
	private JTextArea introduceTextArea;
	
	
	public RegMember3(){
		super("사원 등록");
		
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
		//p.add(createButtons(), BorderLayout.SOUTH);
		
		return p;
	}
	
	private JPanel createNameAndGender() {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel nameLabel = new JLabel("성               명");
		nameText = new JTextField(8);
		JLabel genderLabel = new JLabel("성               별");
		
		genderRadioButton1 = new JRadioButton("남");
		genderRadioButton2 = new JRadioButton("여");
		
		addNameTextListner();
		addGenderRadioButton1Listner();
		addGenderRadioButton2Listner();
				
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
		
		JLabel label1 = new JLabel("주민등록번호");
		residentNumText1 = new JTextField(6);
		JLabel label2 = new JLabel("-");
		residentNumText2 = new JTextField(7);
		
		addResidentNumText2Litener();
		
		p.add(label1);
		p.add(residentNumText1);
		p.add(label2);
		p.add(residentNumText2);
		
		return p;
	}
	private JPanel createAddress() {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label = new JLabel("주               소");
		addressText = new JTextField(22);
		
		addAddressTextLitener();
		
		p.add(label);
		p.add(addressText);
		
		return p;
	}
	private JPanel createDepartment() {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
	
		JLabel label = new JLabel("부      서      명");
		departmentText = new JTextField(8);
		
		addDepartmentTextLitener();
		
		p.add(label);
		p.add(departmentText);
		
		return p;
	}
	private JPanel createHobby() {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label = new JLabel("취               미");
		
		p.add(label);
		
		for(int i = 0; i < checkbox.length; i++) {
			checkbox[i] = new JCheckBox(hobbies[i]);			
			p.add(checkbox[i]);
			checkbox[i].addItemListener(handler);
		}			
		
		return p;
	}
	
	private JPanel createIntroduce(){
		JPanel p = new JPanel(new BorderLayout());
		
		introduceLabel = new JLabel("자  기  소  개");
		introduceTextArea = new JTextArea(9, 22);
		
		p.add(introduceLabel, BorderLayout.NORTH);
		p.add(introduceTextArea, BorderLayout.CENTER);
		
		return p;
	}
	
	
	
	private void addNameTextListner() {
		nameText.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!nameText.getText().equals("")) {
					StringBuffer stringBuffer = new StringBuffer();

					stringBuffer.append("제 이름은 ");
					stringBuffer.append(nameText.getText());
					stringBuffer.append("입니다.");
					stringBuffer.append("\n");

					String string = stringBuffer.toString();
					introduceTextArea.append(string);
				}				
			}
			
		});
	}
	private void addGenderRadioButton1Listner() {
		genderRadioButton1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				StringBuffer stringBuffer = new StringBuffer();
				
				stringBuffer.append("남자 ");
				
				if(e.getStateChange() == e.SELECTED) {
					stringBuffer.append("입니다.");
					stringBuffer.append("\n");				
				}
				else {
					stringBuffer.append("취소");
					stringBuffer.append("\n");
				}
				
				String string = stringBuffer.toString();
				introduceTextArea.append(string);
			}
		}); 
	}
	private void addGenderRadioButton2Listner() {
		genderRadioButton2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				StringBuffer stringBuffer = new StringBuffer();
				
				stringBuffer.append("여자 ");
				
				if(e.getStateChange() == e.SELECTED) {
					stringBuffer.append("입니다.");
					stringBuffer.append("\n");				
				}
				else {
					stringBuffer.append("취소");
					stringBuffer.append("\n");
				}
				
				String string = stringBuffer.toString();
				introduceTextArea.append(string);
			}
		}); 
	}
	
	private void addResidentNumText2Litener() {
		residentNumText2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!residentNumText1.getText().equals("") && !residentNumText2.getText().equals("")) {
					StringBuffer stringbuffer = new StringBuffer();
					stringbuffer.append("주민등록 번호는   ");
					stringbuffer.append(residentNumText1.getText());
					stringbuffer.append("-");
					stringbuffer.append(residentNumText2.getText());
					stringbuffer.append("입니다.");
					stringbuffer.append("\n");
					
					String string = stringbuffer.toString();
					introduceTextArea.append(string);
				}
			}			
		});
	}
	private void addAddressTextLitener() {
		addressText.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!addressText.getText().equals("")) {
					StringBuffer stringbuffer = new StringBuffer();
					stringbuffer.append("주소는 ");
					stringbuffer.append(addressText.getText());
					stringbuffer.append("입니다.");
					stringbuffer.append("\n");
					
					String string = stringbuffer.toString();
					introduceTextArea.append(string);
				}				
			}
			
		});
	}
	private void addDepartmentTextLitener() {
		departmentText.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!departmentText.getText().equals("")) {
					StringBuffer stringbuffer = new StringBuffer();
					stringbuffer.append(departmentText.getText());
					stringbuffer.append(" 부서입니다.");
					stringbuffer.append("\n");
					
					String string = stringbuffer.toString();
					introduceTextArea.append(string);
				}
			}
			
		});
	}
	private ItemListener handler = new ItemListener() {

		@Override
		public void itemStateChanged(ItemEvent e) {
			StringBuffer stringbuffer = new StringBuffer();
			
			if(e.getItem() == checkbox[0]) stringbuffer.append(hobbies[0]);
			else if(e.getItem() == checkbox[1]) stringbuffer.append(hobbies[1]);
			else if(e.getItem() == checkbox[2]) stringbuffer.append(hobbies[2]);
			else stringbuffer.append(hobbies[3]);
			
			if(e.getStateChange() == ItemEvent.SELECTED) {
				stringbuffer.append("가 선택되었습니다.\n");
			}
			else {
				stringbuffer.append("가 해제되었습니다.\n");
			}
			
			String string = stringbuffer.toString();
			introduceTextArea.append(string);
		}
		
	};
	/*private JPanel createButtons() {
		JPanel p = new JPanel(new FlowLayout());
		
		JButton b1 = new JButton("저장");
		JButton b2 = new JButton("종료");
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StringBuffer stringBuffer = new StringBuffer();
				
				if(!nameText.getText().equals("")) {
					stringBuffer.append("제 이름은 ");
					stringBuffer.append(nameText.getText());
					stringBuffer.append("입니다.");
					stringBuffer.append("\n");
				}
				
				if(genderRadioButton1.isSelected() || genderRadioButton2.isSelected()) {
					stringBuffer.append("성별은 ");
					
					if(genderRadioButton1.isSelected()) stringBuffer.append("남자");
					if(genderRadioButton2.isSelected()) stringBuffer.append("여자");
					stringBuffer.append("입니다.");
					stringBuffer.append("\n");
				}
				
				if(!residentNumText.getText().equals("")) {
					stringBuffer.append("주민등록번호는 ");					
					stringBuffer.append(residentNumText.getText());
					stringBuffer.append("입니다.");
					stringBuffer.append("\n");
				}
				
				if(!departmentText.getText().equals("")) {
					stringBuffer.append("부서명은 ");					
					stringBuffer.append(departmentText.getText());
					stringBuffer.append("입니다.");
					stringBuffer.append("\n");
				}
				
				if(check1.isSelected() || check2.isSelected() || check3.isSelected() || check4.isSelected()) {
					stringBuffer.append("취미는 ");
					
					if(check1.isSelected()) stringBuffer.append("영화,   ");
					if(check2.isSelected()) stringBuffer.append("음악감상,   ");
					if(check3.isSelected()) stringBuffer.append("사진,   ");
					if(check4.isSelected()) stringBuffer.append("운동  ");
					
					stringBuffer.append("입니다.");
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
	}*/
}
