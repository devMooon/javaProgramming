package swing.ppt.JFileChoosweEx;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JFileChoosweEX {
	private JFrame frame;
	private JLabel label;
	
	public JFileChoosweEX() {
		frame = new JFrame("파일 대화상자 연습입니다.");
		
		buildGUI();
		
		frame.setSize(200, 120);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {
		frame.setLayout(new GridLayout(2, 1));
		
		frame.add(createRow_1());
		frame.add(createRow_2());
	}
	private JPanel createRow_1() {
		JPanel panel = new JPanel(new FlowLayout());
		JButton fileOpen = new JButton("열기");
		JButton fileSave = new JButton("저장");
		
		fileOpen.addActionListener(fileOpenListener);
		fileSave.addActionListener(fileSaveListener);
		
		panel.add(fileOpen);
		panel.add(fileSave);
		
		return panel;
	}
	private JPanel createRow_2() {
		JPanel panel = new JPanel(new FlowLayout());
		label = new JLabel();
		
		panel.add(label);
		
		return panel;		
	}
	private ActionListener fileOpenListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			JFileChooser chooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png");
			chooser.setFileFilter(filter);
			int ret = chooser.showOpenDialog(frame);
			
			if(ret == JFileChooser.APPROVE_OPTION) {
				String fileName = chooser.getSelectedFile().getPath();
				label.setIcon(new ImageIcon(fileName));
				
				frame.pack();
			}
			else {
				JOptionPane.showMessageDialog(frame, "파일이 선택되지 않았습니다.", "파일 선택 오류", JOptionPane.WARNING_MESSAGE);
			}
		}
		
	};
	private ActionListener fileSaveListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			JFileChooser chooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png");
			chooser.setFileFilter(filter);
			int ret = chooser.showSaveDialog(frame);
			
			if(ret == JFileChooser.APPROVE_OPTION) {
				String fileName = chooser.getSelectedFile().getPath();
				label.setIcon(new ImageIcon(fileName));
				
				frame.pack();
			}
			else {
				JOptionPane.showMessageDialog(frame, "파일이 선택되지 않았습니다.", "파일 선택 오류", JOptionPane.WARNING_MESSAGE);
			}
			
		}
		
	};
}
