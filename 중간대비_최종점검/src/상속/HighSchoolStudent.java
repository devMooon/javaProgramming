package ���;

public class HighSchoolStudent extends Person {
	String food;
	
	HighSchoolStudent(String name, int age, String food){
		super(name, age);
		this.food = food;
	}

	@Override
	public String showInfo() {
		StringBuffer sb = new StringBuffer("���� ���� �����ϴ� ������ ");
		sb.append(food);
		sb.append(" �Դϴ�.");
		String str = sb.toString();	
		return super.showInfo() + str;
	}
	
}
