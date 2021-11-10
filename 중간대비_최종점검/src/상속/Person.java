package 상속;

public class Person {
	protected String name;
	protected int age;
	
	Person(){
		this("홍길동", 100);
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String showInfo() {
		StringBuffer sb = new StringBuffer("제 이름은 " + name + "이고, ");
		sb.append("나이는 " + age + "세 입니다.");
		String str = sb.toString();
		
		return str;
	}
	
	
}
