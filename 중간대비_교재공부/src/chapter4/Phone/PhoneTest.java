package chapter4.Phone;

import java.util.Scanner;

public class PhoneTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("인원수>>");
		PhoneBook phonebook = new PhoneBook(s.nextInt());
		
		for(int i = 0; i < phonebook.phoneArr.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
			String name = s.next();
			String tel = s.next();
			phonebook.phoneArr[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
		
		phonebook.Search();
	}

}
