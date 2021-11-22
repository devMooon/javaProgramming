package 기본컴포넌트;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListEX2 {
	private JFrame frame;
	private JList<String>	mList;
	private JTextField		mTvInput;
	private JButton			mBtnAdd, mBtnDel;
	
	private Vector<String> mData = new Vector<String>();
	
	public JListEX2() {
		frame = new JFrame("JList에 값을 추가하고 삭제하는 연습입니다.");
		
		buildGUI();
		registerListner();
		
		frame.setBounds(100, 200, 400, 200);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {		
		mData.add("apple");
		mData.add("orange");
		
		mList = new JList<String>(mData);
		//mList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 	//뭐지?
		
		frame.add(createInputPanel(), BorderLayout.NORTH);
		frame.add(new JScrollPane(mList), BorderLayout.CENTER);
	}
	private JPanel createInputPanel(){
		JPanel panel = new JPanel(new FlowLayout());
		
		mTvInput = new JTextField(20);
		panel.add(mTvInput);
		
		mBtnAdd = new JButton("추가");
		panel.add(mBtnAdd);
		
		mBtnDel = new JButton("삭제");
		panel.add(mBtnDel);
		
		return panel;
		
	}
	private void registerListner() {
		mBtnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String addData = mTvInput.getText();
				
				mData.add(addData);
				mList.updateUI();
				
				mTvInput.setText("");
			}
			
		});
		
		mBtnDel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int index = mList.getSelectedIndex();
				
				mData.remove(index);
				mList.updateUI();
				
				mTvInput.setText("");
			}
			
		});
		
		mList.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				if(e.getValueIsAdjusting()) {
					int index = e.getFirstIndex();
					System.out.println(index);
					
					mTvInput.setText(mList.getSelectedValue());
					
				}
				
			}
			
		});
	}
	
}
