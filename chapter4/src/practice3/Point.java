package practice3;
//컴퓨터공학전공 20200675 문서연
public class Point {
	private double x;
	private double y;
	
	public Point() {
		this(0, 0);
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//클래스가 public이면 메서드도 public!
	public void setXY(double x, double y) {
		//잘못된 값이면 오류 메시지
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void show() {
		System.out.println("(" + x + "," + y +")");
	}
}
