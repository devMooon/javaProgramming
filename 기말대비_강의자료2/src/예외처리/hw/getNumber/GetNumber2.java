package ����ó��.hw.getNumber;

//�� ����� �ȵ�. �Լ� ���ο� ���� ����ó���� ȣ�������� �Ѱ��ִ� �ɷ� ����
import java.util.InputMismatchException;
import java.util.Scanner;

public class GetNumber2 {
	public static int getInteger() {
		Scanner s = new Scanner(System.in);
		int result;
		
		while(true) {
			try{
				System.out.print("�Է� >> ");
				result = s.nextInt();
				
				break;
			}
			catch(InputMismatchException e) {
				System.err.println("������ �Է� ���ּ���.");
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		
		int result = getInteger();
		
		System.out.println(result + "�� �Է� �޾ҽ��ϴ�.");
	}
}
