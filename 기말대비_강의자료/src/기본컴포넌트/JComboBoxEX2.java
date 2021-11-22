package �⺻������Ʈ;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxEX2 extends JFrame {
	private Vector<PhoneInfo> mData = new Vector<PhoneInfo>();
	
	public JComboBoxEX2(){
		super("JComboBox �����Դϴ�.");
		
		readData();
		buildGUI();
		
		this.setBounds(120, 120, 300, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void readData() {
		mData.add(new PhoneInfo("ȫ�浿", "1990/01/01", "010-111-2222"));
		mData.add(new PhoneInfo("������", "010-123-4567"));
		mData.add(new PhoneInfo("������", "1990/12/31", "010-999-9999"));
		mData.add(new PhoneInfo("���ָ�", "010-777-6666"));
	}
	public void buildGUI() {
		JComboBox<PhoneInfo> cbox = new JComboBox<PhoneInfo>(mData);
		cbox.setMaximumRowCount(3);
		
		cbox.addItemListener(choiceEventListener);
		cbox.addActionListener(selectEventListener);
		
		this.setLayout(new FlowLayout());
		this.add(new JLabel("�̸�"));
		this.add(cbox);
	}
	
	private ItemListener choiceEventListener = new ItemListener() {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED)
				System.out.print("Selected...   ");
			else
				System.out.print("DeSelected...   ");
			
			((PhoneInfo)e.getItem()).show();
			//((PhoneInfo)e.getSource()).show();
			System.out.println();			
		}
		
	};
	private ActionListener selectEventListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			JComboBox<PhoneInfo> cb = (JComboBox<PhoneInfo>)e.getSource();
			System.out.print("����...   ");
			
			((PhoneInfo)(cb.getSelectedItem())).show();
			System.out.println();
			
		}
		
	};
}
