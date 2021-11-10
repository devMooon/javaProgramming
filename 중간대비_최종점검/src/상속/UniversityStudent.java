package ���;

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
		StringBuffer sb = new StringBuffer("�� ������ ");
		sb.append(major);
		sb.append(" �Դϴ�.");
		String str = sb.toString();		
		
		return super.showInfo() + str;
	}
	
	
}
