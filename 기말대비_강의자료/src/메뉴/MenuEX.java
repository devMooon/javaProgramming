package 메뉴;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuEX extends JFrame {
	private JLabel label = new JLabel("Label");
	
	public MenuEX() {
		super("Menu 만들기 예제");
		
		buildGUI();
		
		this.setBounds(100, 100, 500, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		JMenuBar menubar = new JMenuBar();
		menubar.add(createMenu_file());
		menubar.add(createMenu_edit());
		menubar.add(createMenu_format());
		
		this.setJMenuBar(menubar);
		
		this.add(label);
	}
	
	private JMenu createMenu_file() {
		JMenu file = new JMenu("file");
		JMenuItem fileItem_new = new JMenuItem("New");
		JMenuItem fileItem_open = new JMenuItem("Open");
		JMenuItem fileItem_save = new JMenuItem("Save");
		JMenuItem fileItem_saveAs = new JMenuItem("SaveAs");
		
		
		file.add(fileItem_new);
		file.add(fileItem_open);
		file.addSeparator();
		file.add(fileItem_save);
		file.add(fileItem_saveAs);
		
		return file;
	}
	private JMenu createMenu_edit() {
		JMenu edit = new JMenu("편집");
		JMenuItem cancle = new JMenuItem("실행 취소");
		
		cancle.addActionListener(clickMenu);
		
		edit.add(cancle);
		
		return edit;
	}
	private JMenu createMenu_format() {
		JMenu format = new JMenu("서식");
		JCheckBoxMenuItem line = new JCheckBoxMenuItem("자동 줄바꿈");
		
		line.addActionListener(clickMenu);
		
		format.add(line);
		
		return format;
	}
	
	private ActionListener clickMenu = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText(e.getSource().toString());
			
		}
		
	};
}
