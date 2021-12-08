package ppt.homework;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
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

public class EmployeeRegistration extends JFrame {
	//menu
	private JMenuItem menuItem;
	//ro1
	private JTextField nameField;
	//combobox data
	private Vector<String> comboboxData;
	//checkbox data
	private ArrayList<JCheckBox> checkboxs;
	private ArrayList<String> checkboxData;
	//text area
	private JTextArea textArea;
	
	public EmployeeRegistration() {
		super("사원 등록");
		
		createData();
		buildGUI();
		listenerRegistration();
		
		this.setSize(350, 420);
		//윈도우 닫기 이벤트 추가
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setVisible(true);
	}
	private void createData() {
		comboboxData = new Vector<String>();
		comboboxData.add("부서1");
		comboboxData.add("부서2");
		comboboxData.add("부서3");
		comboboxData.add("부서4");
		comboboxData.add("부서5");
		comboboxData.add("부서6");
		comboboxData.add("부서7");
		
		checkboxData = new ArrayList<String>();
		checkboxData.add("영화");
		checkboxData.add("음악");
		checkboxData.add("프로그래밍");
	}
	private void buildGUI(){
		this.setJMenuBar(createJMenuBar());
		this.add(createGrid(), BorderLayout.NORTH);
		this.add(createTextArea(), BorderLayout.CENTER);
	}
	private JMenuBar createJMenuBar() {
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("Option");
		menuItem = new JMenuItem("save");
		
		menubar.add(menu);
		menu.add(menuItem);
		
		return menubar;
	}
	private JPanel createGrid(){
		JPanel panel = new JPanel(new GridLayout(0, 1));
		
		panel.add(ro1());
		panel.add(ro2());
		panel.add(ro3());
		panel.add(ro4());
		panel.add(ro5());
		
		return panel;
	}
	private JPanel ro1() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label = new JLabel("성               명");
		nameField = new JTextField(8);
		JLabel label2 = new JLabel("성        별");
		JRadioButton radio1 = new JRadioButton("남자");
		JRadioButton radio2 = new JRadioButton("여자");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(radio1);
		bg.add(radio2);
		
		panel.add(label);
		panel.add(nameField);
		panel.add(label2);
		panel.add(radio1);
		panel.add(radio2);
		
		return panel;
	}
	private JPanel ro2() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label = new JLabel("주민등록번호");
		JTextField num1 = new JTextField(8);
		JLabel label2 = new JLabel(" - ");
		JTextField num2 = new JTextField(8);
		
		panel.add(label);
		panel.add(num1);
		panel.add(label2);
		panel.add(num2);
		
		return panel;
	}
	private JPanel ro3() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label = new JLabel("주               소");
		JTextField num1 = new JTextField(22);
		
		panel.add(label);
		panel.add(num1);
		
		return panel;
	}
	private JPanel ro4() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label = new JLabel("부      서      명");
		JComboBox<String> comboBox = new JComboBox<String>(comboboxData); 
		comboBox.setMaximumRowCount(3);
		
		panel.add(label);
		panel.add(comboBox);
		
		return panel;
	}
	private JPanel ro5() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label = new JLabel("취               미");
		panel.add(label);
		
		checkboxs = new ArrayList<JCheckBox>();
		
		for(int i = 0; i < checkboxData.size(); i++) {
			checkboxs.add(new JCheckBox(checkboxData.get(i)));
			JCheckBox c = checkboxs.get(i);
			c.addItemListener(checkBoxItemHandler);
			panel.add(c);
		}
		
		return panel;
	}
	private JPanel createTextArea() {
		JPanel panel = new JPanel(new BorderLayout());
		
		JLabel label = new JLabel(" 자   기   소   개");
		textArea = new JTextArea();
		
		panel.add(label, BorderLayout.NORTH);
		panel.add(textArea);
		
		return panel;
	}
	private void listenerRegistration() {
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(EmployeeRegistration.this, 
						"종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
				
				if(result == JOptionPane.YES_OPTION) System.exit(0);
			}
			
		});
		menuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("text file", "txt");
				chooser.setFileFilter(filter);
				int rec = chooser.showOpenDialog(EmployeeRegistration.this);
				
				if(rec == JFileChooser.APPROVE_OPTION) {
					String s = chooser.getSelectedFile().getPath();
				}
				
			}
			
		});
		nameField.addActionListener(enteredHandler);
		
	}
	private ItemListener checkBoxItemHandler = new ItemListener() {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				textArea.setText(getName());
			}
			else {
				
			}
			
		}
		
	};
	private ActionListener enteredHandler = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JTextField text = (JTextField)e.getSource();
			textArea.setText(text.getText());
			
		}

	};
}
