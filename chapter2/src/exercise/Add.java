package exercise;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자 ? :");
		int num1 = s.nextInt();
		System.out.print("두번째 숫자 ? :");
		int num2 = s.nextInt();
		
		
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		
		
	}

}
