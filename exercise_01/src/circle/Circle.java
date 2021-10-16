package circle;

public class Circle {
	private final double PI = 3.14159265;
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
	
	public double getRound() {
		return 1 * PI * getRadius();
	}
	
	public double getArea() {
		return PI * getRadius() * getRadius();
	}
}
