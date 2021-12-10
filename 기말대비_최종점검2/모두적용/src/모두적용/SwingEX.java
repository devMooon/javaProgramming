package 모두적용;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SwingEX extends JFrame {
	//menu
	JMenuItem cusVisibleItem;
	JMenuItem cusDisvisableItem;
	
	JMenuItem radioVisibleItem;
	JMenuItem radioDisvisableItem;
	
	//canvas
	BasicCanvas canvas;
	
	//radiobuttons
	JRadioButton radioButton1;
	JRadioButton radioButton2;
	JRadioButton radioButton3;
	
	public SwingEX() {
		super("마지막 연습입니다.");
		
		buildGUI();
		registerListener();
		
		this.setSize(500, 500);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		canvas = new BasicCanvas();
		
		this.setJMenuBar(createJMenuBar());
		this.add(canvas, BorderLayout.CENTER);
		this.add(createRadioButtons(), BorderLayout.SOUTH);
	}
	private JMenuBar createJMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		
		JMenu cusJMenu = new JMenu("커스텀그래픽");
		cusVisibleItem = new JMenuItem("Visible");
		cusDisvisableItem = new JMenuItem("Disvisable");
		cusJMenu.add(cusVisibleItem);
		cusJMenu.add(cusDisvisableItem);
		menuBar.add(cusJMenu);
		
		JMenu radioJMenu = new JMenu("라디오버튼");
		radioVisibleItem = new JMenuItem("Visible");
		radioDisvisableItem = new JMenuItem("Disvisable");
		radioJMenu.add(radioVisibleItem);
		radioJMenu.add(radioDisvisableItem);
		menuBar.add(radioJMenu);
		
		return menuBar;
	}

	private class BasicCanvas extends JComponent {

		@Override
		public void paint(Graphics g) {
			g.drawString("20200675 문서연", 200, 200);
		}
		
	}
	private JPanel createRadioButtons() {
		JPanel panel = new JPanel();
		
		radioButton1 = new JRadioButton("선택하세요");
		radioButton2 = new JRadioButton("선택하세요");
		radioButton3 = new JRadioButton("선택하세요");
		ButtonGroup buttonGroup = new ButtonGroup();
		
		buttonGroup.add(radioButton1);
		buttonGroup.add(radioButton2);
		buttonGroup.add(radioButton3);
		panel.add(radioButton1);
		panel.add(radioButton2);
		panel.add(radioButton3);
		
		return panel;
	}
	private void registerListener() {
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(SwingEX.this, "창을 닫겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_OPTION) System.exit(0);
			}
			
		});
		cusVisibleItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setVisible(true);
				
			}
		});
		cusDisvisableItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.setVisible(false);
				
			}
		});
		radioVisibleItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				radioButton1.setVisible(true);
				radioButton2.setVisible(true);
				radioButton3.setVisible(true);
				canvas.setVisible(false);
				
			}
		});
		radioDisvisableItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				radioButton1.setVisible(false);
				radioButton2.setVisible(false);
				radioButton3.setVisible(false);
				
			}
		});
	}
}
