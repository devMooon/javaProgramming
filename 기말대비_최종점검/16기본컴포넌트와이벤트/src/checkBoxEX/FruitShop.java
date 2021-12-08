package checkBoxEX;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FruitShop extends JFrame {
	private Vector<String> fruitName;
	private Vector<Integer> fruitPrice;
	private JCheckBox[] checkBoxList;
	private JTextField textField;
	
	public FruitShop() {
		super("원하는 과일을 고르세요.");
		
		createData();
		buildGUI();
		
		this.setSize(500, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void createData() {
		fruitName = new Vector<String>();
		fruitPrice = new Vector<Integer>();
		
		fruitName.add("apple");
		fruitName.add("banana");
		fruitName.add("cherry");
		fruitName.add("mango");
		
		fruitPrice.add(500);
		fruitPrice.add(1000);
		fruitPrice.add(2000);
		fruitPrice.add(3000);
		
		checkBoxList = new JCheckBox[fruitName.size()];
	}
	
	private void buildGUI() {
		this.setLayout(new BorderLayout());
		this.add(labelPanel(), BorderLayout.NORTH);
		this.add(checkBoxPanel(), BorderLayout.CENTER);
		this.add(textFieldPanel(), BorderLayout.SOUTH);
	}
	
	private JPanel labelPanel() {
		JPanel panel = new JPanel();
		StringBuffer sb = new StringBuffer();

		sb.append("\"");
		for(int i = 0; i < fruitName.size(); i++) {
			sb.append(fruitName.get(i) + " ");
			sb.append(fruitPrice.get(i) + "원, ");
		}
		sb.append("\"");
		
		String s = sb .toString();
		
		panel.add(new JLabel(s));
		
		return panel;
	}
	
	private JPanel checkBoxPanel() {
		JPanel panel = new JPanel();
		
		for(int i = 0; i < checkBoxList.length; i++) {			
			checkBoxList[i] = new JCheckBox(fruitName.get(i));
			checkBoxList[i].addItemListener(selectedCheckBox);
			panel.add(checkBoxList[i]);
		}
		
		return panel;
	}
	
	private JPanel textFieldPanel() {
		JPanel panel = new JPanel();
		
		textField = new JTextField(30);
		panel.add(textField);
		
		return panel;
	}
	
	private ItemListener selectedCheckBox = new ItemListener() {
		private int seletedIndex = -1;
		private int sum = 0;

		@Override
		public void itemStateChanged(ItemEvent e) {
			JCheckBox c = (JCheckBox)e.getSource();
			
			for(int i = 0; i < fruitName.size(); i++) {
				if(c.getText().equals(fruitName.get(i))) {
					seletedIndex = i;
					break;
				}
			}
			
			if(c.isSelected()) {
				sum += fruitPrice.get(seletedIndex);
			}
			else {
				sum -= fruitPrice.get(seletedIndex);
			}
			textField.setText("총 " + sum + "원입니다.");
			
		}
		
	};
}
