package 메뉴;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuActionEventEX {
	private JFrame frame;
	private JLabel label = new JLabel();
	
	public MenuActionEventEX() {
		frame = new JFrame("Menu에 Action 리스너 만들기 예제");
		
		buildGUI();
		
		frame.setSize(286, 255);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public void buildGUI() {
		label = new JLabel();
		
		frame.setJMenuBar(createMenu());
		frame.add(label);
		
	}
	private JMenuBar createMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Screen");
		String[] menuItemStrings = new String[] {"Load", "Hide", "ReShow", "Exit"};
		
		for(int i = 0; i < menuItemStrings.length; i++) {
			JMenuItem item = new JMenuItem(menuItemStrings[i]);
			item.addActionListener(MenuActionListener);
			menu.add(item);
		}
	
		menuBar.add(menu);
		
		return menuBar;
	}
	private ActionListener MenuActionListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String msg = e.getActionCommand();
			switch(msg) {
			case "Load":
				if(label.getIcon() != null)
					return;
				label.setIcon(new ImageIcon("image/banana.jpg"));
				break;
			case "Hide":
				label.setVisible(false);
				break;
			case "ReShow":
				label.setVisible(true);
				break;
			case "Exit":
				System.exit(0);
				break;
			}
			
		}
		
	};
}
