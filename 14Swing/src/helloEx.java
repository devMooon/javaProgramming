import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class helloEx extends JFrame {
	helloEx(){
		super("helloEx");
		
		//프레임 구성
		buildGUI();
		
		//프레임 기본 설정
		//this.setSize(500, 300);
		//this.setLocation(100, 100);
		this.setBounds(100, 100, 500, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void buildGUI() {
		JTextField text = new JTextField(10);
		JButton button = new JButton("확인");
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	private JFrame create_panel() {
		return new JFrame();
	}
}