package chapter4.Phone;

import java.util.Scanner;

public class PhoneTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�ο���>>");
		PhoneBook phonebook = new PhoneBook(s.nextInt());
		
		for(int i = 0; i < phonebook.phoneArr.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ ���� �Է�)>>");
			String name = s.next();
			String tel = s.next();
			phonebook.phoneArr[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");
		
		phonebook.Search();
	}

}
