package ��ȭ����;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooserEX {
	private JFrame frame;
	private ImageIcon image;
	private JLabel imageLabel;
	public FileChooserEX() {
		frame = new JFrame("���� �Է� ����");
		
		buildGUI();
		
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public void buildGUI() {
		JButton btn = new JButton("file upload");
		imageLabel = new JLabel();
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter(
						"JPG & PNG Images",
						"jpg", "png"
				);
				chooser.setFileFilter(filter);
				
				int ret = chooser.showOpenDialog(frame);
				if(ret != JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(frame, "������ ���õ��� �ʾҽ��ϴ�.", "���� �Է� ����", JOptionPane.WARNING_MESSAGE);
				}
				else {
					String imageName = chooser.getSelectedFile().getPath();
					image = new ImageIcon(imageName);
					imageLabel.setIcon(image);
					
					frame.pack();
				}
			}
			
		});
		frame.add(btn, BorderLayout.NORTH);
		frame.add(imageLabel);
	}
}
