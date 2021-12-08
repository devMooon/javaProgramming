package checkBoxEX2;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FruitShop extends JFrame {
	private ArrayList<JCheckBox> checkBox;
	private ArrayList<Integer> price;
	private ArrayList<String> name;
	private StringBuffer sb;
	private String str;
	private JLabel label;
	
	public FruitShop() {
		super("과일 가격 더하기");
		
		setData();
		buildGUI();
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void setData()
	{
		checkBox = new ArrayList<JCheckBox>();
		price = new ArrayList<Integer>();
		name = new ArrayList<String>();
		sb = new StringBuffer();
		
		name.add("사과");		price.add(500);
		name.add("바나나");	price.add(1000);
		name.add("체리");		price.add(2000);
		
		for(int i = 0; i < name.size(); i++) {
			checkBox.add(new JCheckBox(name.get(i)));
		}
		
		sb.append("\"");
		for(int i = 0; i < name.size(); i++) {
			sb.append(name.get(i) + " ");
			sb.append(price.get(i) + "원, ");
		}
		sb.append("\"");
		
		str = sb.toString();
	}
	private void buildGUI()
	{
		label = new JLabel();
		
		this.add(new JLabel(str), BorderLayout.NORTH);
		this.add(createJPanel());
		this.add(label, BorderLayout.SOUTH);
		
	}
	private JPanel createJPanel() {
		JPanel panel = new JPanel();
		
		Iterator<JCheckBox> itr = checkBox.iterator();
		while(itr.hasNext()) {
			JCheckBox c = itr.next();
			c.addItemListener(checkBoxHandler);
			panel.add(c);
		}
		
		return panel;
	}
	private ItemListener checkBoxHandler = new ItemListener() {
		private int sum = 0;
		private int selectedIndex = -1;
		@Override
		public void itemStateChanged(ItemEvent e) {
			JCheckBox c = (JCheckBox)e.getItem();
			for(int i = 0; i < checkBox.size(); i++) {
				if(c.equals(checkBox.get(i))) {
					selectedIndex = i;
					break;
				}
			}
			
			if(e.getStateChange() == ItemEvent.SELECTED) sum += price.get(selectedIndex);
			else sum -= price.get(selectedIndex);
			
			label.setText("총 " + sum + "원 입니다.");
		}
		
	};
}
