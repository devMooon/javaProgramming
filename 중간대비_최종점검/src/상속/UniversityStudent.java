package 상속;

public class UniversityStudent extends Person {
	private String major;
	
	public UniversityStudent(String name, int age, String major){
		super(name, age);
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String showInfo() {
		StringBuffer sb = new StringBuffer("제 전공은 ");
		sb.append(major);
		sb.append(" 입니다.");
		String str = sb.toString();		
		
		return super.showInfo() + str;
	}
	
	
}
