package 예외처리.hw.getNumber;

//이 방식은 안됨. 함수 내부에 대한 예외처리는 호출측으로 넘겨주는 걸로 하자
import java.util.InputMismatchException;
import java.util.Scanner;

public class GetNumber2 {
	public static int getInteger() {
		Scanner s = new Scanner(System.in);
		int result;
		
		while(true) {
			try{
				System.out.print("입력 >> ");
				result = s.nextInt();
				
				break;
			}
			catch(InputMismatchException e) {
				System.err.println("정수를 입력 해주세요.");
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		
		int result = getInteger();
		
		System.out.println(result + "를 입력 받았습니다.");
	}
}
