package �������;

import java.util.Scanner;

public class Student {
	Scanner s = new Scanner(System.in);
	private Exam e;
	int repeat;
	private int correct;
	
	Student(){
		e = new Exam();
	}
	public void startExam() {
		System.out.print("�ݺ�Ƚ�� >> ");
		this.repeat = s.nextInt();
		e.getExam(repeat);
		correct = e.getScore();
		show();
	}
	public void show() {
		System.out.println("��! " + repeat + "���� �� " + correct +"������ ����ٰ�?! �� ���߳�!!");
	}
}
