package 예외처리.hw.getNumber;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GetNumber {
	public static int getInteger() throws InputMismatchException {
		Scanner s = new Scanner(System.in);
		int result;
		
		System.out.print("입력 >> ");
		result = s.nextInt();
	
		return result;
	}
	public static void main(String[] args) {
		
		int result;
		while(true) {
			try{
				result = getInteger();
				break;
			}
			catch(InputMismatchException e) {
				System.err.println("정수를 입력 해주세요.");
			}
		}
		
		System.out.println(result + "를 입력 받았습니다.");
	}

}
