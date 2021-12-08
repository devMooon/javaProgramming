package ppt.listEX;

import java.awt.GridLayout;
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

public class ListEX extends JFrame {
	private Vector<String> v;
	private JList<String> list;
	private Thread thread;
	private JTextField inputData;
	private JButton addBtn;
	private JButton delBtn;
	
	public ListEX() {
		super("리스트 예제");
		
		//thread = new Thread(new createRunnable());
		//thread.start();
		
		createData();
		buildGUI();
		registerListener();
		
		this.setSize(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void createData() {
		v = new Vector<String>();
		list = new JList<String>(v);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		v.add("축구");
		v.add("야구");
		v.add("배구");
		v.add("농구");
		v.add("수영");
		v.add("족구");
		
	}
	private void buildGUI() {
		this.setLayout(new GridLayout(0, 1));
		inputData = new JTextField(10);
		 
		this.add(new JScrollPane(list));
		this.add(inputData);
		this.add(btns());
		
	}
	private JPanel btns() {
		JPanel panel = new JPanel();
		
		addBtn = new JButton("add");
		delBtn = new JButton("del");
		
		panel.add(addBtn);
		panel.add(delBtn);
		
		return panel;
	}
	private void registerListener() {
		inputData.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				v.add(t.getText());
				list.updateUI();
			}
			
		});
		//private JButton addBtn;
		//private JButton delBtn;
		
		list.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(e.getValueIsAdjusting()) {
					int idx = e.getFirstIndex();
					System.out.println(idx);
					
					inputData.setText(list.getSelectedValue());
				}
				
			}
			
		});
	}
	
	
	private class createRunnable implements Runnable{

		@Override
		public void run() {
			while(thread == Thread.currentThread()) {
				if(v != null && v.size() > 0) {
					list.updateUI();
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}
		
	}
	
	
}
