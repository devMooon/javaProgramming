package textbook.예제9_6;

import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEX extends JFrame {
	private ArrayList<JButton> btnList;
	public NoLayoutEX() {
		super("예제 9-6");
		
		btnList = new ArrayList<JButton>();
		buildGUI();
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(null);
		
		int x = 100;
		int y = 100;
		
		for(int i = 0; i < 10; i++) {
			btnList.add(new JButton(i + 1 + ""));
			JButton btn = btnList.get(i);
			btn.setLayout(null);
			btn.setSize(50, 20);
			btn.setLocation(x + (i * 10), y + (i * 10));
			this.add(btn);
		}
		
	}
}
