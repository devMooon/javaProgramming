package swing.ppt.JListEx;

import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class JListEX {
	private JFrame frame;
	private Vector<String> v = new Vector<String>();
	private JList<String> list;
	public JListEX() {
		frame = new JFrame("리스트 연습입니다.");
		
		makeData();
		buildGUI();
		
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public void makeData() {
		v.add("apple");
		v.add("mango");
		v.add("banana");
		v.add("melon");
		v.add("apple");
		v.add("mango");
		v.add("banana");
		v.add("melon");
		v.add("apple");
		v.add("mango");
		v.add("banana");
		v.add("melon");
		v.add("apple");
		v.add("mango");
		v.add("banana");
		v.add("melon");
	}
	public void buildGUI() {
		frame.setLayout(new FlowLayout());
		list = new JList<String>(v);
		
		frame.add(new JScrollPane(list));
	}
}
