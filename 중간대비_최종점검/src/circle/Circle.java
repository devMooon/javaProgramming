package circle;

public class Circle {
	static final double PI = 3.14159265;
	static int circleNum = 0;
	private int radius;
	
	Circle(){
		this(0);
	}
	Circle(int radius){
		this.radius = radius;
		circleNum++;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public static int getCircleNum() {
		return circleNum;
	}
	public static void setCircleNum(int circleNum) {
		Circle.circleNum = circleNum;
	}
	
	public double getCircumference() {
		return PI * radius * 2;
	}
	public double getArea(){
		return PI * radius * radius;
	}
	
	public void show() {
		System.out.print("������ : " + radius);
		System.out.print(", �ѷ� : " + getCircumference());
		System.out.print(", ���� : " + getArea());
		System.out.println(", �� ��ü�� �� : " + circleNum);	
	}
}
