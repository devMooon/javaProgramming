package windowListenerEX;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CloseWindow extends JFrame {
	public CloseWindow() {
		super("창닫기 예제");
		
		buildGUI();
		
		this.setSize(200, 200);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				int rec = JOptionPane.showConfirmDialog(CloseWindow.this, "창을 닫겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
				
				//받은 값이 잘못되었나 싶어 출력을 해봤습니다.. 
				//그런데 rec와 JOptionPane.YES_OPTION 값이 달라서 
				//if문으로 들어가지 않는다는 것을 확인 했습니다..!
				System.out.println(rec);
				System.out.println(JOptionPane.YES_OPTION);
				
				if(rec == JOptionPane.YES_OPTION) System.exit(0);
				
				//JFrame만 닫히는 것 같아 visible을 설정 해봤는데, 적용이 안됩니다..
				//else CloseWindow.this.setVisible(true);
			}
			
			
		});
	}
}

