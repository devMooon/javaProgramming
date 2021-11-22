package �⺻������Ʈ;

import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JListEX extends JFrame {
	public JListEX() {
		super("JList �����Դϴ�.");
		
		buildGUI();
		
		this.setBounds(300, 200, 300, 220);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		this.setLayout(new FlowLayout());
		
		this.add(createArrayList());
		this.add(createVetorList());
		this.add(createModelList());
		this.add(createObjectModelList());
	}
	private JPanel createArrayList() {
		JPanel panel = new JPanel();
		
		String[] listData = {"one", "two", "three", "four", "five"};
		
		JList<String> list = new JList<String>(listData);
		
		list.setSelectedIndex(1);
		
		panel.add(list);
		
		return panel;
	}
	private JPanel createVetorList() {
		JPanel panel = new JPanel();
		
		Vector<String> listData = new Vector<String>();
		listData.add("�౸");
		listData.add("�߱�");
		listData.add("��");
		listData.add("�豸");
		listData.add("�״Ͻ�");
		listData.add("�౸");
		listData.add("�߱�");
		listData.add("��");
		listData.add("�豸");
		listData.add("�״Ͻ�");
		listData.add("�౸");
		listData.add("�߱�");
		listData.add("��");
		listData.add("�豸");
		listData.add("�״Ͻ�");
		
		JList<String> list = new JList<String>(listData);
		list.setSelectedIndex(0);
		
		//panel.add(list);
		panel.add(new JScrollPane(list)); //JScrollPane ������ Jlist�� �߰�
		
		return panel;
	}
	private JPanel createModelList() {
		JPanel panel = new JPanel();
		
		return panel;
	}
	private JPanel createObjectModelList() {
		JPanel panel = new JPanel();
		
		return panel;
	}
}
