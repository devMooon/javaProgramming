import javax.swing.JFrame;

public class JFrameEx1 {
	
	private JFrame Jframe;
	
	JFrameEx1(){
		Jframe = new JFrame("JFrame Test1");
		
		//프레임 구성
		buildGUI();
		
		//Jframe.setSize(500, 300);
		//Jframe.setLocation(100, 100);
		Jframe.setBounds(100, 100, 500, 300);
		Jframe.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
		Jframe.setVisible(true);
	}
	
	private void buildGUI() {
		
	}
}
