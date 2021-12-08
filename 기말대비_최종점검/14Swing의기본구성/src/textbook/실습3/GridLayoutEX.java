package textbook.실습3;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEX extends JFrame {
	private ArrayList<JButton> buttonList;
	public GridLayoutEX() {
		super("실습 3");
		
		buttonList = new ArrayList<JButton>();
		buildGUI();
		
		this.setSize(500, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		this.setLayout(new GridLayout(1, 10));
		
		for(int i = 0; i < 10; i++) {
			buttonList.add(new JButton(i + 1 + ""));
			this.add(buttonList.get(i));
		}
	}
}
