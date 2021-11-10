package 산수문제;

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
		System.out.print("반복횟수 >> ");
		this.repeat = s.nextInt();
		e.getExam(repeat);
		correct = e.getScore();
		show();
	}
	public void show() {
		System.out.println("헐! " + repeat + "문제 중 " + correct +"문제를 맞췄다고?! 왕 잘했네!!");
	}
}
