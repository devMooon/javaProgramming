package ex.IteratorEX;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEX {

	public static void main(String[] args) {
		//ArrayList컬렉션 생성 -> 제네릭 클래스로 컴파일 할 때 자료형이 String으로 정해짐
		ArrayList<String> list = new ArrayList<String>();
		
		//컬렉션에 값 넣기
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		
		//컬렉션의 반복자 객체 반환
		Iterator<String> itr = list.iterator();
		System.out.println("삭제 전");
		
		//다음 값이 있으면 true 반환
		while(itr.hasNext()) {
			String current = itr.next(); //다음 값 반환
			System.out.println(current);
			
			//다음 값이 "Third"와 같으면
			if(current.compareTo("Third") == 0) {
				itr.remove();
			}
		}
		
		itr = list.iterator();
		
		System.out.println("삭제 후");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
