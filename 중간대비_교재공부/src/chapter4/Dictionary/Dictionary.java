package chapter4.Dictionary;

public class Dictionary {
	private static String [] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	
	public static String kor2Eng(String word) {
		if(word.equals("�׸�")) {
			System.out.println("�ý����� �����մϴ�.");
			return "�׸�";
		}
		for(int i = 0; i < kor.length; i++) {
			if(kor[i].equals(word)) {
				return (word + "�� " + eng[i]);
			}
		}
		return (word + "�� ���� ������ �����ϴ�.");
	}
}
