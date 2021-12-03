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
		super("�޺��ڽ� ����");
		
		makeData();
		buildGUI();
		
		this.setBounds(120, 120, 300, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void makeData() {
		mData.add(new PhoneInfo("ȫ�浿", "010-111-1111"));
		mData.add(new PhoneInfo("��浿", "010-222-1111"));
		mData.add(new PhoneInfo("���浿", "010-333-1111"));
		mData.add(new PhoneInfo("�ڱ浿", "010-444-1111"));
		mData.add(new PhoneInfo("�̱浿", "010-555-1111"));
	}
	private void buildGUI() {
		this.setLayout(new FlowLayout());
		JComboBox<PhoneInfo> checkBox = new JComboBox<PhoneInfo>(mData);
		checkBox.setMaximumRowCount(3);
		
		this.add(checkBox);
	}
}
