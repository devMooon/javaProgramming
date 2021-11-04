package chapter4.Dictionary;

public class Dictionary {
	private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	
	public static String kor2Eng(String word) {
		if(word.equals("그만")) {
			System.out.println("시스템을 종료합니다.");
			return "그만";
		}
		for(int i = 0; i < kor.length; i++) {
			if(kor[i].equals(word)) {
				return (word + "는 " + eng[i]);
			}
		}
		return (word + "는 저의 사전에 없습니다.");
	}
}
