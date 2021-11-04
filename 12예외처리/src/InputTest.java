import java.util.Scanner;
import java.util.InputMismatchException;

public class InputTest {
	public static int getInteger() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int num;
		
		while(true) {
			try {
				num = scanner.nextInt();
				return num;
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닌 문자열을 입력했습니다. 다시 입력해주세요!");
				scanner.nextLine();
				continue;
			}
		}
	}
	public static void main(String[] args) {
		int num = getInteger();
		System.out.println(num + "을 입력했습니다.");
	}

}
