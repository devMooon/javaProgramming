package ���;

public class main {

	public static void main(String[] args) {
		Person p = new Person("������", 10);
		UniversityStudent US = new UniversityStudent("������", 21, "��ǻ�Ͱ���");
		HighSchoolStudent HS = new HighSchoolStudent("�����", 17, "������");
		
		System.out.println(p.showInfo());
		System.out.println(US.showInfo());
		System.out.println(HS.showInfo());
	}

}
