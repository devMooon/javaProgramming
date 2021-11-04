package chapter4.Phone;

import java.util.Scanner;

public class PhoneBook {
	Scanner s = new Scanner(System.in);
	Phone[] phoneArr;
	int size;
	
	PhoneBook(int size){
		this.size = size;
		phoneArr = new Phone[size];
	}
	void Search() {
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String name = s.next();
			if(name.equals("�׸�")) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}
			else{
				
				for(Phone p : phoneArr) {
					if(p.getName().equals(name)) {
						System.out.println(name + "�� ��ȣ�� " + p.getTel() + " �Դϴ�.");
						continue;
					}
				}
				System.out.println(name + "�� �����ϴ�.");
		}
	}
}}
