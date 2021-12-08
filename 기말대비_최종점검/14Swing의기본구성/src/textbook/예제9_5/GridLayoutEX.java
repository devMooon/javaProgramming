package textbook.����9_5;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEX extends JFrame {
	public GridLayoutEX() {
		super("���� 9-5");
		
		buildGUI();
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		this.setLayout(new GridLayout(4, 3));
		
		this.add(new JLabel("�̸�"));
		this.add(new JLabel(""));
		this.add(new JTextField("Ȳ����", 10));
		
		this.add(new JLabel("�й�"));
		this.add(new JLabel(""));
		this.add(new JTextField("17", 10));

		this.add(new JLabel("�а�"));
		this.add(new JLabel(""));
		this.add(new JTextField("��ǻ�Ͱ��а�", 10));

		this.add(new JLabel("����"));
		this.add(new JLabel(""));
		this.add(new JTextField("�ڹ�", 10));

	}
}
