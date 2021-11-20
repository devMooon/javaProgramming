package 기본컴포넌트;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JRadioButtonEX2 {
	private JFrame frame;
	private JRadioButton[] radioButtons = new JRadioButton[3];
	private String[] names = {"사과", "비나나", "체리"};
	private ImageIcon[] images = new ImageIcon[3];
	private String[] imagesAddress = {"apple.jpg", "banana.jpg", "cherry.jpg"};
	
	public JRadioButtonEX2() {
		frame = new JFrame("JRadioButton 연습입니다.");
		
		buildGUI();
		
		frame.setBounds(500, 300, 400, 400);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	private void buildGUI() {
		frame.add(northPanel(), BorderLayout.NORTH);
		//frame.add(centerPanel(), BorderLayout.CENTER);
	}
	private JPanel northPanel(){
		JPanel panel = new JPanel(new FlowLayout());
		panel.setBackground(Color.gray);
	
		ButtonGroup buttonGroup = new ButtonGroup();
		
		for(int i = 0; i < 3; i++) {			
			radioButtons[i] = new JRadioButton(names[i]);
			images[i] = new ImageIcon("image/" + imagesAddress[i]);
			radioButtons[i] .setSelectedIcon(images[i]);
			buttonGroup.add(radioButtons[i]);
			panel.add(radioButtons[i]);
		}
		
		return panel;
		
	}
	/*private JPanel centerPanel() {
		
	}*/
}
