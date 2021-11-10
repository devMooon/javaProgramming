package ���ǳ���;

public class Circle {
	final double PI = 3.14159265;
	private int radius;
	
	public Circle() {
		this(0);
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return PI * radius * radius;
	}
	public void show() {
		System.out.println("�������� " + getRadius() + "�� ���� ���� : " + getArea());
	}
	
}
