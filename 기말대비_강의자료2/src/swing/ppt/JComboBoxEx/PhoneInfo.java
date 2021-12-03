package swing.ppt.JComboBoxEx;

public class PhoneInfo {
	private String name;
	private String phoneNum;
	
	public PhoneInfo(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return name + ", " + phoneNum;
	}
	
}
