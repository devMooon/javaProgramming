package ����ó��.hw.getNumber;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GetNumber {
	public static int getInteger() throws InputMismatchException {
		Scanner s = new Scanner(System.in);
		int result;
		
		System.out.print("�Է� >> ");
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
				System.err.println("������ �Է� ���ּ���.");
			}
		}
		
		System.out.println(result + "�� �Է� �޾ҽ��ϴ�.");
	}

}
