package chapter4.circle;

public class Circle {
	final static double PI = 3.141592;
	private int radius;
	
	Circle(){
		this(0);
	}
	Circle(int radius){
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	double getArea(){
		return (PI * radius * radius);
	}
	
	
}
