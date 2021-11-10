package 상속;

public class main {

	public static void main(String[] args) {
		Person p = new Person("문세라", 10);
		UniversityStudent US = new UniversityStudent("문서연", 21, "컴퓨터공학");
		HighSchoolStudent HS = new HighSchoolStudent("김우중", 17, "떡볶이");
		
		System.out.println(p.showInfo());
		System.out.println(US.showInfo());
		System.out.println(HS.showInfo());
	}

}
