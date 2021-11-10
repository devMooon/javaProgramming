package 원의넓이;

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
		System.out.println("반지름이 " + getRadius() + "인 원의 넓이 : " + getArea());
	}
	
}
