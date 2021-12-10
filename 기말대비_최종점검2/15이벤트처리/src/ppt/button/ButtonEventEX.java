package ppt.button;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonEventEX extends JFrame {
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	
	public ButtonEventEX() {
		super("버튼 예제");
		
		buildGUI();
		setDesign();
		registerListener();
		
		this.setSize(500, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		this.add(createJPanel(), BorderLayout.NORTH);
	}
	private JPanel createJPanel() {
		JPanel panel = new JPanel(new GridLayout(3, 1));
		
		panel.add(makeButton1());
		panel.add(makeButton2());
		panel.add(makeButton3());
		
		return panel;
	}
	private JPanel makeButton1() {
		JPanel panel = new JPanel(new FlowLayout());
		
		btn1 = new JButton("Margenta/Yellow Button");
		panel.add(btn1);
		
		return panel;
	}
	private JPanel makeButton2() {
		JPanel panel = new JPanel(new FlowLayout());
		
		btn2 = new JButton("Disabled Button");
		panel.add(btn2);
		
		return panel;
	}
	private JPanel makeButton3() {
		JPanel panel = new JPanel(new FlowLayout());
		
		btn3 = new JButton("getX(), getY()");
		panel.add(btn3);		
		
		return panel;
	}
	private void setDesign(){
		btn1.setBackground(Color.YELLOW);
		btn2.setEnabled(false);
	}
	private void registerListener() {
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int x = ((JButton)(e.getSource())).getX();
				int y = ((JButton)(e.getSource())).getY();
				
				ButtonEventEX.this.setTitle("(" + x + ", " + y + ")");
			}
		});
	}
}
