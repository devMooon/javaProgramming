package customGraphics;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CustomVibration extends JFrame {
	private BasicCanvas bc;
	private Thread thread;
	
	public CustomVibration() {
		super("커스텀 그래픽이 진동합니다.");
		
		buildGUI();
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		bc = new BasicCanvas();
		
		this.addWindowListener(windowHandler);
		this.setJMenuBar(createJMenuBar());
		this.add(bc);
		this.add(createBtns(), BorderLayout.SOUTH);
	}
	private JMenuBar createJMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Option");
		JMenuItem exitMenuItem = new JMenuItem("exit");
		JMenuItem saveMenuItem = new JMenuItem("save");
		
		exitMenuItem.addActionListener(actionHandler);
		saveMenuItem.addActionListener(saveHandler);
		
		menuBar.add(menu);
		menu.add(exitMenuItem);
		menu.add(saveMenuItem);
		
		return menuBar;
	}
	private JPanel createBtns() {
		JPanel panel = new JPanel();
		
		JButton startBtn = new JButton("시작");
		JButton stopBtn = new JButton("중지");
		startBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				thread = new Thread(new createRunnable());
				thread.start();
			}
			
		});
		stopBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				thread = null;
				
			}
			
		});
		
		panel.add(startBtn);
		panel.add(stopBtn);
		
		return panel;
	}
	private WindowListener windowHandler = new WindowAdapter(){

		@Override
		public void windowClosing(WindowEvent e) {
			int result = JOptionPane.showConfirmDialog(CustomVibration.this, "종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
			if(result == JOptionPane.YES_OPTION) System.exit(0);
			
		}
		
	};
	private ActionListener actionHandler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(CustomVibration.this, "종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
			if(result == JOptionPane.YES_OPTION) System.exit(0);
			
			
		}
		
	};
	private ActionListener saveHandler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			JFileChooser chooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
					"Jpg & png", "jpg", "png");
			chooser.setFileFilter(filter);
			
			int rec = chooser.showOpenDialog(CustomVibration.this);
			if(rec == JFileChooser.CANCEL_OPTION) {
				JOptionPane.showMessageDialog(CustomVibration.this, "파일이 선택되지 않았습니다.", "비정상종료", JOptionPane.WARNING_MESSAGE);;
				
			}
			
		}
		
	};
	
	private class BasicCanvas extends JComponent {
		final int x = 100;
		final int y = 50;
		int term = 20;
		
		
		@Override
		public void paint(Graphics g) {
			g.drawString("진동 레이블", x + term, y);
			term = -term;
		}
		
	}
	private class createRunnable implements Runnable {

		@Override
		public void run() {
			while(thread == Thread.currentThread()) {
				bc.repaint();
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
		
	}
}
