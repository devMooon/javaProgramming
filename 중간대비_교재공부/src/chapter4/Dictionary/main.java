package chapter4.Dictionary;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Dictionary d = new Dictionary();
		
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			
			String result = d.kor2Eng(s.next());
			if(result.equals("�׸�")) {
				break;
			}
			else {
				System.out.println(result);
			}
		}
		
	}

}
