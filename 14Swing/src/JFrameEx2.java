import javax.swing.JFrame;

public class JFrameEx2 extends JFrame {
	
	JFrameEx2(){
		super("JFrame Test2");
		
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
		
	}
}
