import java.util.Scanner;
import java.util.InputMismatchException;

public class InputTest {
	public static int getInteger() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���. : ");
		int num;
		
		while(true) {
			try {
				num = scanner.nextInt();
				return num;
			}
			catch(InputMismatchException e) {
				System.out.println("������ �ƴ� ���ڿ��� �Է��߽��ϴ�. �ٽ� �Է����ּ���!");
				scanner.nextLine();
				continue;
			}
		}
	}
	public static void main(String[] args) {
		int num = getInteger();
		System.out.println(num + "�� �Է��߽��ϴ�.");
	}

}
