package ex.poly;

public class StudentTest1 {

	public static void main(String[] args) {
		//업캐스팅
		Person p = new UnivStudent("홍길동", 20, "컴퓨터공학");
		p.WhatYourName();
		
		//자식에서 추가된 멤버 접근 불가
		//p.WhoAreYou();
	
		//기본적으로 다운 캐스팅은 컴타일 때 오류
		//UnivStudent s_cerr = new Person("일지매", 18);	
		
		//잘못된 명시적 다운 캐스팅은 런타임 때 오류
		try {
			UnivStudent s_rerr = (UnivStudent) new Person("일지매", 18);
			s_rerr.WhoAreYou();
		}
		catch(ClassCastException e) {
			e.printStackTrace();
		}
		
		//유효한 다운 캐스팅
		if(p instanceof UnivStudent) {
			((UnivStudent) p).WhoAreYou();
		}
	}

}
