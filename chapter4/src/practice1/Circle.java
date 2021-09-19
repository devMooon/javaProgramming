package practice1;

public class Circle {
	final double PI = 3.141592;
	int radius;
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return PI * this.radius * this.radius;
	}
	public double getCircumference() {
		return 2 * PI * this.radius;
	}
}
