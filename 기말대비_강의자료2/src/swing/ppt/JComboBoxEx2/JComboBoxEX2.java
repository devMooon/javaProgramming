package swing.ppt.JComboBoxEx2;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JComboBoxEX2 {
	private JFrame frame;
	private Vector<String> mData = new Vector<String>();
	private JTextField textField;
	private JComboBox<String> comboBox;
	
	public JComboBoxEX2() {
		frame = new JFrame("콤보박스에 항목 추가, 삭제");
		
		makeDate();
		buildGUI();
		
		frame.setSize(220, 110);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void makeDate() {
		 mData.add("apple");
		 mData.add("banana");
		 mData.add("cherry");
	}
	private void buildGUI() {
		frame.add(makeGrid());
		
	}
	private JPanel makeGrid() {
		JPanel panel = new JPanel(new GridLayout(0, 1));
		
		panel.add(makeFlow1());
		panel.add(makeFlow2());
		
		return panel;
	}
	private JPanel makeFlow1() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		textField = new JTextField(13);
		comboBox = new JComboBox<String>(mData);
		comboBox.setMaximumRowCount(3);
		
		textField.addActionListener(addEventListener);
		comboBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED){
					textField.setText(((JComboBox)e.getSource()).getSelectedItem().toString());
				}
			}
			
		});
		panel.add(textField);
		panel.add(comboBox);
		
		return panel;
	}
	private JPanel makeFlow2() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JButton addBtn = new JButton("추가");
		JButton delBtn = new JButton("삭제");
		
		addBtn.addActionListener(addEventListener);
		delBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					mData.remove(comboBox.getSelectedIndex());
					comboBox.setSelectedIndex(0);
					textField.setText("");
				}
				catch(IllegalArgumentException e1) {
					comboBox.setSelectedItem(null);
				}
				catch(ArrayIndexOutOfBoundsException e2) {
					JOptionPane.showMessageDialog(frame, "삭제할 값이 없습니다.", "오류", JOptionPane.ERROR_MESSAGE);
					
				}
				
			}
			
		});
		
		panel.add(addBtn);
		panel.add(delBtn);
		
		return panel;
	}
	private ActionListener addEventListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(textField.getText().trim().length() != 0) {
				mData.add(textField.getText());
				comboBox.setSelectedIndex(mData.size()-1);
				textField.setText("");
			}
			else {
				JOptionPane.showMessageDialog(frame, "값이 입력되지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				
			}
		}
		
	};
}
