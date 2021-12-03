package swing.ppt.JComboBoxEx;

import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JComboBoxEX extends JFrame {
	private Vector<PhoneInfo> mData = new Vector<PhoneInfo>();
	public JComboBoxEX() {
		super("콤보박스 예제");
		
		makeData();
		buildGUI();
		
		this.setBounds(120, 120, 300, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void makeData() {
		mData.add(new PhoneInfo("홍길동", "010-111-1111"));
		mData.add(new PhoneInfo("김길동", "010-222-1111"));
		mData.add(new PhoneInfo("문길동", "010-333-1111"));
		mData.add(new PhoneInfo("박길동", "010-444-1111"));
		mData.add(new PhoneInfo("이길동", "010-555-1111"));
	}
	private void buildGUI() {
		this.setLayout(new FlowLayout());
		JComboBox<PhoneInfo> checkBox = new JComboBox<PhoneInfo>(mData);
		checkBox.setMaximumRowCount(3);
		
		this.add(checkBox);
	}
}
