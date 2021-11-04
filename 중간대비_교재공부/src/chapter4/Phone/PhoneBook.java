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
			System.out.print("검색할 이름>>");
			String name = s.next();
			if(name.equals("그만")) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			else{
				
				for(Phone p : phoneArr) {
					if(p.getName().equals(name)) {
						System.out.println(name + "의 번호는 " + p.getTel() + " 입니다.");
						continue;
					}
				}
				System.out.println(name + "이 없습니다.");
		}
	}
}}
