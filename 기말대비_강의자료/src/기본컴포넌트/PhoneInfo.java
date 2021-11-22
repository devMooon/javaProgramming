package 기본컴포넌트;

public class PhoneInfo {
	private String name;
	private String birthDay;
	private String phoneNum;
	
	public PhoneInfo(String name, String birthDay, String phoneNum) {
		this.name = name;
		this.birthDay = birthDay;
		this.phoneNum = phoneNum;
	}
	
	public PhoneInfo(String name, String phoneNum) {
		this(name, null, phoneNum);
	}
	
	public void show() {
		System.out.print(name);
		if(birthDay != null)
			System.out.print("(" + birthDay + ")");
		else
			System.out.print("\t");
		System.out.print("\t" + phoneNum + " ");
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
