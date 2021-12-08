package 예외처리;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {
	public static int getInt() throws InputMismatchException {
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자를 하나 입력 하세요.");
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
				System.err.println("정수를 입력하세요!");
			}
		}
		System.out.println("정수 " + result + "이 입력되었습니다.");
		
	}

}
