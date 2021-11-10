package 상속;

public class HighSchoolStudent extends Person {
	String food;
	
	HighSchoolStudent(String name, int age, String food){
		super(name, age);
		this.food = food;
	}

	@Override
	public String showInfo() {
		StringBuffer sb = new StringBuffer("제가 가장 좋아하는 음식은 ");
		sb.append(food);
		sb.append(" 입니다.");
		String str = sb.toString();	
		return super.showInfo() + str;
	}
	
}
