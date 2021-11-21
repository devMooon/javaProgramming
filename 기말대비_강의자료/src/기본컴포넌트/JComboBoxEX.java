package 기본컴포넌트;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxEX extends JFrame {
	private Vector<String> strings1 = new Vector<String>();
	private JComboBox<String> comboBox1;
	private JComboBox<String> comboBox2;
	
	public JComboBoxEX() {
		super("JComboBox 컴포넌트 연습");
		
		readData();
		buildGUI();
		
		this.setBounds(500, 300, 200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void readData() {
		strings1.add("사과");
		strings1.add("바나나");
		strings1.add("참외");
		strings1.add("키위");
		strings1.add("오렌지");
	}
	private void buildGUI() {
		//콤보박스 객체 생성
		comboBox1 = new JComboBox<String>(strings1);
		comboBox2 = new JComboBox<String>();
		//콤보박스 최대 사이즈 지정
		comboBox1.setMaximumRowCount(3);
		comboBox2.setMaximumRowCount(3);
		
		comboBox1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) 
					comboBox2.addItem((String)((JComboBox<String>)e.getSource()).getSelectedItem());
			}
			
		});
		
		
		this.setLayout(new FlowLayout());
		this.add(comboBox1);
		this.add(comboBox2);
	}
}
