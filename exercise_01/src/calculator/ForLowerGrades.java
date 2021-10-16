package calculator;

import java.util.Random;
import java.util.Scanner;

public class ForLowerGrades {
	Random r = new Random();
	Scanner s = new Scanner(System.in);
	
	private int repeat;
	private int cutLine;
	private int num1;
	private int num2;
	private char oper;
	private int answer;
	private int correctAnswer = 0;
	
	ForLowerGrades(){
		this(10);
	}
	ForLowerGrades(int repeat){
		this.repeat = repeat;
		cutLine = (int)(repeat*0.3);
		if (cutLine == 0) cutLine = 1;
	}
	
	public void start() {
		int chance;
		for(int i = 0; i < repeat; i++) {
			chance  = cutLine;
			makeExam();

			for(int k = 0; k < chance; k++) {
				chance--;
				printExam(i);
				if(inputAnswer()) {
					System.out.println("�����Դϴ�!");
					correctAnswer++;
					break;
				}
				else if(chance <= 0) {
					System.out.println("Ʋ�Ƚ��ϴ�.. ������ " + answer + "�Դϴ�!");
					break;
				}
				else {
					System.out.println("Ʋ�Ƚ��ϴ�.. ���� ��ȸ�� " + chance + "��!");
				}
			}
		}
		showResult();
	}
	
	private void makeExam() {
		num1 = r.nextInt(10);
		num2 = r.nextInt(10);
		if (r.nextInt(2) == 0) { //����
			oper = '+';
			answer = num1 + num2;
		}
		else { //����
			oper = '-';
			answer = num1 - num2;
		}
	}
	private void printExam(int i) {
		System.out.println("�� " + (i + 1) + "�� ����");
		System.out.print(num1);
		System.out.print(oper);
		System.out.print(num2 + " = ");
	}
	private boolean inputAnswer() {
		if(s.nextInt() == answer) return true;
		else return false;
	}
	public void showResult() {
		System.out.println();
		System.out.println("*** Result ***");
		System.out.println(repeat + "���� ��..");
		System.out.println("���� ����: " + correctAnswer);
		System.out.println("���� ����: " + (repeat - correctAnswer));
	}	
}
