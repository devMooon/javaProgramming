package ppt.checkbox;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CheckBoxEventEX extends JFrame {
	private Vector<String> fruit;
	private Vector<Integer> price;
	private Vector<JCheckBox> checkBoxs;
	private JLabel resultJLabel;
	
 	public CheckBoxEventEX() {
		super("���� ������ ��");
		
		setData();
		buildGUI();
		registerListener();
		
		this.setSize(400, 400);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setVisible(true);
	}
	private void setData() {
		fruit = new Vector<String>();
		fruit.add("���");
		fruit.add("�ٳ���");
		fruit.add("����");
		fruit.add("ü��");
		
		price = new Vector<Integer>();
		price.add(500);
		price.add(800);
		price.add(1000);
		price.add(2000);
		
		checkBoxs = new Vector<JCheckBox>();
		for(int i = 0; i < fruit.size(); i++) {
			checkBoxs.add(new JCheckBox(fruit.get(i)));
			checkBoxs.get(i).addItemListener(checkBoxEventHandler);
		}
	}
	private void buildGUI() {
		this.setLayout(new BorderLayout());
		this.add(finalJPanel(), BorderLayout.NORTH);
	}
	private JPanel finalJPanel() {
		JPanel panel = new JPanel(new BorderLayout());
		
		panel.add(createLabel(), BorderLayout.NORTH);
		panel.add(createCheckBox(), BorderLayout.CENTER);
		panel.add(createResult(), BorderLayout.SOUTH);
		
		return panel;
	}
	private JPanel createLabel() {
		JPanel panel = new JPanel(new FlowLayout());
		StringBuffer sBuffer = new StringBuffer();
		
		sBuffer.append("\" ");
		for(int i = 0; i < fruit.size(); i++) {
			sBuffer.append(fruit.get(i) + price.get(i) + "��, ");
		}
		sBuffer.append(" \"");
		
		panel.add(new JLabel(sBuffer.toString()));
		return panel;
	}
	private JPanel createCheckBox() {
		JPanel panel = new JPanel(new FlowLayout());
		
		Iterator<JCheckBox> itr = checkBoxs.iterator();
		while(itr.hasNext()) {
			panel.add(itr.next());
		}
		
		return panel;
	}
	private JPanel createResult() {
		JPanel panel = new JPanel();
		
		resultJLabel = new JLabel();
		panel.add(resultJLabel);
		
		return panel;		
	}
	private void registerListener(){
		CheckBoxEventEX.this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(CheckBoxEventEX.this, "�����Ͻðڽ��ϱ�?", "����", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_OPTION) System.exit(0);
			}
			
		} );
	}
	private ItemListener checkBoxEventHandler = new ItemListener() {
		private int sum = 0;
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			int index = 0;
			JCheckBox checkBox = (JCheckBox)e.getItem();
			String string = checkBox.getText();
			
			for(int i = 0; i < fruit.size(); i++) {
				if(string == fruit.get(i)) {
					index = i;
					break;
				}
			}
			
			if(e.getStateChange() == ItemEvent.SELECTED) {
				sum += price.get(index);
			}
			else {
				sum -= price.get(index);
			}
			
			resultJLabel.setText("�� " + sum + "�� �Դϴ�.");
		}
		
	};
}
