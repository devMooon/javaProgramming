package 파일입출력;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ByteFileCopy extends JFrame {
	private int selectedIndex;
	private JComboBox<String> comboBox;
	private JList<String> list;
	private Vector<String> comboboxVector;
	private Vector<String> listVector;
	public ByteFileCopy() {
		super("바이트 스트림을 이용한 파일 복사");
		
		createData();
		buildGUI();
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void createData() {
		comboboxVector = new Vector<String>();
		listVector = new Vector<String>();
		
		comboboxVector.add("사과");
		comboboxVector.add("바나나");
		comboboxVector.add("체리");
		comboboxVector.add("키위");
		comboboxVector.add("토마토");
		comboboxVector.add("딸기");
		comboboxVector.add("망고");
		comboboxVector.add("수박");
	}
	private void buildGUI() {
		this.setLayout(new FlowLayout());
		JButton saveBtn = new JButton("save");
		
		saveBtn.addActionListener(new ActionListener() {
			FileWriter fw = null;
			BufferedWriter bw = null;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					fw = new FileWriter("과일.txt");
					bw = new BufferedWriter(fw);
					
					Iterator<String> itr = listVector.iterator();
					while(itr.hasNext()) {
						String s = itr.next();
						System.out.println(s);
						bw.write(s);
					}
					JOptionPane.showMessageDialog(ByteFileCopy.this, "파일을 저장 완료 했습니다.", "저장 완료", JOptionPane.INFORMATION_MESSAGE) ;
					
					
				} catch (IOException e1) {
					
						try {
							if(bw != null) bw.close();
							if(fw != null) fw.close();
							
						} catch (IOException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
					
				}
				}
			
			
		});
		this.add(createJComboBox());
		this.add(createJList());
		this.add(saveBtn);
	}
	private JPanel createJComboBox() {
		JPanel panel = new JPanel();
		comboBox = new JComboBox<String>(comboboxVector);
		comboBox.setMaximumRowCount(5);
		
		comboBox.addItemListener(comboBoxHandeler);
		
		panel.add(comboBox);
		return panel;
	}
	private JPanel createJList() {
		JPanel panel = new JPanel();
		list = new JList<String>(listVector);
		
		list.addListSelectionListener(listHandeler);
		
		panel.add(new JScrollPane(list));
		return panel;
	}
	private ItemListener comboBoxHandeler = new ItemListener() {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				selectedIndex = comboBox.getSelectedIndex();
				listVector.add(comboboxVector.get(selectedIndex));
				comboboxVector.remove(selectedIndex);
				
				list.updateUI();
			}
		}
		
	};
	private ListSelectionListener listHandeler = new ListSelectionListener() {

		@Override
		public void valueChanged(ListSelectionEvent e) {
			try {
				selectedIndex = list.getSelectedIndex();
				comboboxVector.add(listVector.get(selectedIndex));
				listVector.remove(selectedIndex);
				
				list.updateUI();
				
			}catch(ArrayIndexOutOfBoundsException e1) {
				JOptionPane.showMessageDialog(ByteFileCopy.this, "잘못된 선택", "오류", JOptionPane.ERROR_MESSAGE);
				
			}
			
	
		}
		
	};

}
