package chapter4.Dictionary;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Dictionary d = new Dictionary();
		
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글 단어?");
			
			String result = d.kor2Eng(s.next());
			if(result.equals("그만")) {
				break;
			}
			else {
				System.out.println(result);
			}
		}
		
	}

}
