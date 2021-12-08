package textbook.예제9_5;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEX extends JFrame {
	public GridLayoutEX() {
		super("예제 9-5");
		
		buildGUI();
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		this.setLayout(new GridLayout(4, 3));
		
		this.add(new JLabel("이름"));
		this.add(new JLabel(""));
		this.add(new JTextField("황기태", 10));
		
		this.add(new JLabel("학번"));
		this.add(new JLabel(""));
		this.add(new JTextField("17", 10));

		this.add(new JLabel("학과"));
		this.add(new JLabel(""));
		this.add(new JTextField("컴퓨터공학과", 10));

		this.add(new JLabel("과목"));
		this.add(new JLabel(""));
		this.add(new JTextField("자바", 10));

	}
}
