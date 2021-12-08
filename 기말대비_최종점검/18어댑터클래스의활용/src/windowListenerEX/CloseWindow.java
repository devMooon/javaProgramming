package windowListenerEX;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CloseWindow extends JFrame {
	public CloseWindow() {
		super("â�ݱ� ����");
		
		buildGUI();
		
		this.setSize(200, 200);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setVisible(true);
	}
	private void buildGUI() {
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				int rec = JOptionPane.showConfirmDialog(CloseWindow.this, "â�� �ݰڽ��ϱ�?", "����", JOptionPane.YES_NO_OPTION);
				
				//���� ���� �߸��Ǿ��� �;� ����� �غý��ϴ�.. 
				//�׷��� rec�� JOptionPane.YES_OPTION ���� �޶� 
				//if������ ���� �ʴ´ٴ� ���� Ȯ�� �߽��ϴ�..!
				System.out.println(rec);
				System.out.println(JOptionPane.YES_OPTION);
				
				if(rec == JOptionPane.YES_OPTION) System.exit(0);
				
				//JFrame�� ������ �� ���� visible�� ���� �غôµ�, ������ �ȵ˴ϴ�..
				//else CloseWindow.this.setVisible(true);
			}
			
			
		});
	}
}

