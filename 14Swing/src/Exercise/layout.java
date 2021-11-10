package Exercise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class layout extends JFrame {
	
	layout(){
		super("사원 등록");
		
		buildGUI();
		
		this.setBounds(800, 100, 350, 420);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void buildGUI() {
		//상에 이미 구성된 쟁반 올리기
		this.add(create_super_border_panel());
	}
	
	
	//가장 바깥 panel
	private JPanel create_super_border_panel() {
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(create_grid_panel(), BorderLayout.NORTH);
		panel.add(create_border_panel(), BorderLayout.CENTER);
		
		return panel;
	}
	
	
	//그 안의 panel 2개
	private JPanel create_grid_panel() {
		JPanel panel = new JPanel(new GridLayout(5, 1));
		panel.add(create_grid_twoStr_twoTxt_panel("성               명", 8, "성       별", 3));
		panel.add(create_grid_twoStr_twoTxt_panel("주민등록번호", 6, "-", 7));
		panel.add(create_grid_oneStr_oneTxt_panel("주               소", 22));
		panel.add(create_grid_oneStr_oneTxt_panel("부      서      명", 8));
		panel.add(create_grid_oneStr_oneTxt_panel("취               미", 22));

		return panel;
	}
	private JPanel create_border_panel() {
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(create_border_center_panel(), BorderLayout.CENTER);
		panel.add(create_border_south_panel(), BorderLayout.SOUTH);
		
		return panel;
	}
	
	
	
	//그 안의 안의 panel
	private JPanel create_grid_twoStr_twoTxt_panel(String string1, int num1, String string2, int num2) {
		JPanel panel = new JPanel(); 
		panel.setLayout(new FlowLayout(FlowLayout.LEFT)); 
		
		panel.add(new JLabel(string1));
		panel.add(new JTextField(num1));
		panel.add(new JLabel(string2));
		panel.add(new JTextField(num2));
		
		//panel.setBackground(Color.RED);

		return panel;
	}
	private JPanel create_grid_oneStr_oneTxt_panel(String string, int num) {		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		panel.add(new JLabel(string));
		panel.add(new JTextField(num));
		
		//panel.setBackground(Color.YELLOW);
		
		return panel;
	}
	
	
	
	private JPanel create_border_center_panel() {
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(new JLabel("자   기   소   개"), BorderLayout.NORTH);
		panel.add(new JTextArea(9, 22), BorderLayout.CENTER);
		
		return panel;
	}
	private JPanel create_border_south_panel() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.add(new JButton("저장"));
		panel.add(new JButton("종료"));
		
		return panel;
	}
}
