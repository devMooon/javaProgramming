import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class helloEx extends JFrame {
	helloEx(){
		super("helloEx");
		
		//������ ����
		buildGUI();
		
		//������ �⺻ ����
		//this.setSize(500, 300);
		//this.setLocation(100, 100);
		this.setBounds(100, 100, 500, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void buildGUI() {
		JTextField text = new JTextField(10);
		JButton button = new JButton("Ȯ��");
	}
	private JFrame create_panel() {
		return new JFrame();
	}
}