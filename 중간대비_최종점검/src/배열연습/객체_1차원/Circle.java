package 배열연습.객체_1차원;

public class Circle {
	final static double PI = 3.14;
	private int radius;
	
	public Circle(int radius){
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return radius * PI * PI;
	}
}
