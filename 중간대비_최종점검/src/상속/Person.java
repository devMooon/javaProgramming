package ���;

public class Person {
	protected String name;
	protected int age;
	
	Person(){
		this("ȫ�浿", 100);
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String showInfo() {
		StringBuffer sb = new StringBuffer("�� �̸��� " + name + "�̰�, ");
		sb.append("���̴� " + age + "�� �Դϴ�.");
		String str = sb.toString();
		
		return str;
	}
	
	
}
