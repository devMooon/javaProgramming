package swing.ppt.JRadioButtonEx;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JRadioButtonEX extends JFrame {
	private int size = 3;
	private String[] fruits = new String[] {"���", "��", "ü��"};
	private int[] prices = new int[] {100, 500, 2000};
	private JRadioButton[] radioBtns = new JRadioButton[size];
	private JLabel label2;
	
	public JRadioButtonEX() {
		super("���� ��ư ����");
		
		buildGUI();
		
		this.setSize(250, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		this.setLayout(new FlowLayout());
		
		this.add(makeForm());		
	}
	private JPanel makeForm() {
		JPanel panel = new JPanel(new GridLayout(0, 1));
		
		JLabel label1 = new JLabel("��� 100��, �� 500��, ü�� 20000��");
		label2 = new JLabel("���� 0�� �Դϴ�.");
		
		panel.add(label1);
		panel.add(makeRadioBtnsForm());
		panel.add(label2);
		
		return panel;
	}
	private JPanel makeRadioBtnsForm() {
		JPanel panel = new JPanel();
		
		ButtonGroup btns = new ButtonGroup();
		
		for(int i = 0; i < size; i++) {
			radioBtns[i] = new JRadioButton(fruits[i]);
			radioBtns[i].addItemListener(radioBtnsListener);
			btns.add(radioBtns[i]);
			panel.add(radioBtns[i]);
		}
		return panel;
	}
	private ItemListener radioBtnsListener = new ItemListener() {
		private int sum = 0;
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				for(int i = 0; i < size; i++) {
					if(e.getItem() == radioBtns[i]) sum += prices[i];
				}
			}
			else {
				for(int i = 0; i < size; i++) {
					if(e.getItem() == radioBtns[i]) sum -= prices[i];
				}
			}
			label2.setText("���� " + sum + " �� �Դϴ�.");
		}
		
	};
}
