package switch���ǹ�;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("���� Ŀ�� �帱���? ");
		String coffe = s.next();
		int price = 0;
		
		switch(coffe) {
			case "����������":
			case "īǪġ��" :
			case "ī���" :
				price = 3500;
				break;
			case "�Ƹ޸�ī��":
				price = 2000;
				break;
			default:
				System.out.println("�޴��� �����ϴ�.");
		}
		
		if(price != 0) System.out.println(coffe+" ���Խ��ϴ�. " + price +"�� �ּ���!!");
		
	}

}
