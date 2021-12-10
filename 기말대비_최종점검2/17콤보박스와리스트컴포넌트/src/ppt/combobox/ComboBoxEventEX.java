package ppt.combobox;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ComboBoxEventEX extends JFrame {
	private Vector<String> vStrings;
	private JComboBox<String> comboBox;
	private JTextField actionTextField;
	private JTextField itemTextField;
	
	public ComboBoxEventEX() {
		super("콤보박스 action & item event 연습");
		
		setData();
		buildGUI();
		registerListener();
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setVisible(true);
	}
	private void setData() {
		vStrings = new Vector<String>();
		vStrings.add("사과");
		vStrings.add("바나나");
		vStrings.add("체리");
		vStrings.add("망고");
		vStrings.add("오렌지");
		vStrings.add("참외");
	}
	private void buildGUI() {
		comboBox = new JComboBox<String>(vStrings);
		
		this.add(comboBox);
		this.add(actionLabelJPanel(), BorderLayout.NORTH);
		this.add(itemLabelJPanel(), BorderLayout.SOUTH);
	}
	private JPanel actionLabelJPanel() {
		JPanel panel = new JPanel(new FlowLayout());
		
		JLabel label = new JLabel("action event");
		actionTextField = new JTextField("");
		
		panel.add(label);
		panel.add(actionTextField);
		
		return panel;
	}
	private JPanel itemLabelJPanel() {
		JPanel panel = new JPanel(new FlowLayout());
		
		JLabel label = new JLabel("item event");
		itemTextField = new JTextField("");
		
		panel.add(label);
		panel.add(itemTextField);
		
		return panel;
	}
	private void registerListener() {
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(ComboBoxEventEX.this, "창을 닫겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_OPTION) System.exit(0);
			}
			
		});
		
		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> c = (JComboBox<String>)e.getSource();
				String s = c.getSelectedItem().toString();
				
				System.out.println(s);
				actionTextField.setText(s);
				repaint();
			}
			
		});
		
		comboBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				JComboBox c = (JComboBox)e.getSource();
				String s = c.getSelectedItem().toString();
				
				System.out.println(s);
				itemTextField.setText(s);
				itemTextField.updateUI();
				
			}
		});
	}
}
