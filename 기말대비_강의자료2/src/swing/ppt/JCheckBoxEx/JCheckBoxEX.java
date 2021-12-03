package swing.ppt.JCheckBoxEx;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JCheckBoxEX {
	private JFrame frame;
	private int size;
	private String[] furits;
	private int[] price;
	private JCheckBox[] checkboxs;
	private JLabel label;
	
	public JCheckBoxEX() {
		frame = new JFrame("체크박스 예제");
		
		setData();
		buildGUI();
		
		frame.setSize(250, 200);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void setData() {
		size = 3;
		
		furits = new String[size];
		furits[0] = "사과";
		furits[1] = "배";
		furits[2] = "체리";
		
		price = new int[size];
		price[0] = 100;
		price[1] = 500;
		price[2] = 2000;
		
		checkboxs = new JCheckBox[size];
		for(int i = 0; i < size; i++) {
			checkboxs[i] = new JCheckBox(furits[i]);
			checkboxs[i].setBorderPainted(true);
			checkboxs[i].addItemListener(checkBoxListener);
		}
	}
	private void buildGUI() {
		frame.add(makeJPanel());
	}
	private JPanel makeJPanel() {
		JPanel panel = new JPanel();
		
		label = new JLabel("현재 0원 입니다.");
		
		panel.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		panel.add(makeCheckboxs());
		panel.add(label);
		return panel;
	}
	private JPanel makeCheckboxs() {
		JPanel panel = new JPanel(new FlowLayout());
		
		for(int i = 0; i < size; i++) {
			panel.add(checkboxs[i]);
		}
		
		return panel;
	}
	private ItemListener checkBoxListener = new ItemListener() {
		private int sum = 0;
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			/*JCheckBox[] c = (JCheckBox[])e.getSource();
			System.out.println(c);
			JCheckBox c1 = (JCheckBox)e.getItem();
			System.out.println(c1);*/
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == checkboxs[0]) sum += price[0];
				else if(e.getItem() == checkboxs[1]) sum += price[1];
				else if(e.getItem() == checkboxs[2]) sum += price[2];
			}
			else {
				if(e.getItem() == checkboxs[0]) sum -= price[0];
				else if(e.getItem() == checkboxs[1]) sum -= price[1];
				else if(e.getItem() == checkboxs[2]) sum -= price[2];
			}
			label.setText("현재 " + sum + "원 입니다");
		}
		
	};
}
