package ppt.comboboxEX;

public class PhoneInfo {
	private String name;
	private String phoneNum;
	private int age;
	
	public PhoneInfo(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.age = -1;
	}
	public PhoneInfo(String name, String phoneNum, int age) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "/ " + phoneNum;
	}
	
}
