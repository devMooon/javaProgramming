package �⺻������Ʈ;

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
		super("JComboBox ������Ʈ ����");
		
		readData();
		buildGUI();
		
		this.setBounds(500, 300, 200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void readData() {
		strings1.add("���");
		strings1.add("�ٳ���");
		strings1.add("����");
		strings1.add("Ű��");
		strings1.add("������");
	}
	private void buildGUI() {
		//�޺��ڽ� ��ü ����
		comboBox1 = new JComboBox<String>(strings1);
		comboBox2 = new JComboBox<String>();
		//�޺��ڽ� �ִ� ������ ����
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
