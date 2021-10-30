package ex.poly;

public class UnivStudent extends Person{
	private String major;
	
	public UnivStudent(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	@Override
	public void WhatYourName() {
		super.WhatYourName();
		System.out.print(" " + major + "����");
	}
	
	public void WhoAreYou() {
		System.out.println("�� �̸��� " + name + "�Դϴ�.");
	}
	
	
}
