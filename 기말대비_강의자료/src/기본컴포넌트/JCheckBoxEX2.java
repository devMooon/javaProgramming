package �⺻������Ʈ;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JCheckBoxEX2 {
	private JFrame frame;
	private String[] fruitNames = {"���", "��", "ü��"};
	private int[] prices = {100, 500, 2000};
	private JCheckBox[] checkBox;
	private int value;
	private JLabel label2;
	 
	public JCheckBoxEX2() {
		frame = new JFrame("JCheckBox �����Դϴ�.");
		
		buildGUI();
		
		frame.setBounds(500, 300, 200, 200);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {
		frame.setLayout(new FlowLayout());
		
		JLabel label1 = new JLabel("��� 100��, �� 500��, ü�� 2000��");
		
		JPanel panel = new JPanel(new FlowLayout());
		checkBox = new JCheckBox[3];
		
		for(int i = 0; i < 3; i++) {
			checkBox[i] = new JCheckBox(fruitNames[i]);
			checkBox[i].addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange() == ItemEvent.SELECTED) {
						if(e.getItem() == checkBox[0]) value += prices[0];
						else if(e.getItem() == checkBox[1]) value += prices[1];
						else value += prices[2];
					}
					else {
						if(e.getItem() == checkBox[0]) value -= prices[0];
						else if(e.getItem() == checkBox[1]) value -= prices[1];
						else value -= prices[2];
					}
					
					label2.setText("���� " + value + "�� �Դϴ�.");

				}
				
			});

			panel.add(checkBox[i]);
		}
		
		label2 = new JLabel("���� 0�� �Դϴ�.");
		
		frame.add(label1);
		frame.add(panel);
		frame.add(label2);		
	}
}
