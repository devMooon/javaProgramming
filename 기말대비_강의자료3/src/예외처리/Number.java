package ����ó��;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {
	public static int getInt() throws InputMismatchException {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���ڸ� �ϳ� �Է� �ϼ���.");
		int num = s.nextInt();
		return num;
	}
	public static void main(String[] args) {
		int result;
		
		while(true) {
			try {
				result = getInt();
				break;
				
			} catch(InputMismatchException e) {
				System.err.println("������ �Է��ϼ���!");
			}
		}
		System.out.println("���� " + result + "�� �ԷµǾ����ϴ�.");
		
	}

}
