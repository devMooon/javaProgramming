package chapter5.Point;

public class Point {
	private int x;
	private int y;
	
	Point(){
		this(0, 0);
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	boolean equals(Point p){
		if(x == p.getX() && y == p.getY()) return true;
		else return false;
	}
}
