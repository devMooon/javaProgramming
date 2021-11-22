package 기본컴포넌트;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JComboBoxEX3 extends JFrame {
	private JTextField 			mTvInput;
	private JComboBox<String> 	mCombo;
	private JButton 			mBtnAdd, mBtnDel;
	
	public JComboBoxEX3() {
		super("JComboBox 추가와 삭제 연습입니다.");
		
		buildGUI();
		registerListener();
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI(){
		this.setLayout(new FlowLayout());
		
		mTvInput = new JTextField(10);
		mBtnAdd = new JButton("추가");
		mBtnDel = new JButton("삭제");
		mBtnDel.setEnabled(false);
		
		String[] fruits = {"apple", "banana", "kiwi", "mango"};
		mCombo = new JComboBox<String>(fruits);
		mCombo.setMaximumRowCount(3);
		
		this.add(mTvInput);
		this.add(mBtnAdd);
		this.add(mBtnDel);
		this.add(mCombo);
	}
	private void registerListener(){
		mBtnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String addString = mTvInput.getText();
				
				mCombo.addItem(addString);
				
				mTvInput.setText("");
				
			}
			
		});
		mCombo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mTvInput.setText((String)mCombo.getSelectedItem());
				mBtnDel.setEnabled(true);
				
			}

			
		});
		mBtnDel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String addString = mTvInput.getText();
				
				mCombo.removeItem(addString);
				
				mTvInput.setText("");
				mBtnDel.setEnabled(false);
				
			}
			
		});
	}
}
