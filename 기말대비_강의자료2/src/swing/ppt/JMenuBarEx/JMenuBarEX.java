package swing.ppt.JMenuBarEx;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuBarEX extends JFrame {
	private ImageIcon image = new ImageIcon("image/banana.jpg");
	JLabel imageLabel;
	
	public JMenuBarEX() {
		super("메뉴바 연습");
		
		buildGUI();
		
		this.setSize(250, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		imageLabel = new JLabel();
		
		this.add(imageLabel);
		this.setJMenuBar(buildMenuBar());
		
	}
	private JMenuBar buildMenuBar() {
		JMenuBar menubar = new JMenuBar();
		JMenu menuScreen = new JMenu("Screen");
		JMenu menuEdit = new JMenu("Edit");
		JMenu menuSource = new JMenu("Source");
		JMenu menuProject = new JMenu("Project");
		JMenu menuRun = new JMenu("Run");
		JMenuItem menuItemLoad = new JMenuItem("Load");
		JMenuItem menuItemHide = new JMenuItem("Hide");
		JMenuItem menuItemReShow = new JMenuItem("ReShow");
		JMenuItem menuItemExit = new JMenuItem("Exit");
		
		menuItemLoad.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				imageLabel.setIcon(image);
				
			}
			
		});
		menuItemHide.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				imageLabel.setVisible(false);
				
			}
			
		});
		menuItemReShow.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				imageLabel.setVisible(true);
				
			}
			
		});
		menuItemExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		});
		
		menubar.add(menuScreen);
		menubar.add(menuEdit);
		menubar.add(menuSource);
		menubar.add(menuProject);
		menubar.add(menuRun);
		menuScreen.add(menuItemLoad);
		menuScreen.add(menuItemHide);
		menuScreen.add(menuItemReShow);
		menuScreen.addSeparator();
		menuScreen.add(menuItemExit);
		
		return menubar;
	}
	
}
