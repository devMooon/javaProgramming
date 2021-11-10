package �������;

import java.util.Random;
import java.util.Scanner;

public class Exam {
	Random r = new Random();
	Scanner s = new Scanner(System.in);
	private int num1;
	private int num2;
	private char oper;
	private int answer;
	private int result;
	private int correct = 0;
	private int chance = 3;
	private int repeat = 10;
	
	public void setExam() {
		num1 = r.nextInt(10) + 1;
		num2 = r.nextInt(10) + 1;
		if(r.nextInt(2) == 1) {
			oper = '-';
			result = num1 - num2;
		}
		else {
			oper = '+';
			result = num1 + num2;
		}
	}
	public void showExam() {
		System.out.print(num1 + " " + oper + " " + num2 + " = ");
		answer = s.nextInt();
	}
	public void getExam(int repeat) {
		this.repeat = repeat;
		for(int i = 0; i < repeat; i++) {
			setExam();
			
			for(int k = 0; k < chance; k++) {
				showExam();
				if(isCorrect()) {
					System.out.println("�����Դϴ�!");
					correct++;
					break;
				}
				else {
					System.out.println("������ �ƴմϴ�...");
					if(k == chance-1) System.out.println("��ȸ�� ��� ����ϴ�... ������ " + result + "!");
				}
			}
		}
		show();
	}
	public boolean isCorrect() {
		if (answer == result) {
			return true;
		}
		else {
			return false;
		}
	}
	public int getScore() {
		return correct;
	}
	public void show() {
		System.out.println("�� " + repeat +"���� ���� �� " +correct+" ������ ������ϴ�!");
	}
	
}
