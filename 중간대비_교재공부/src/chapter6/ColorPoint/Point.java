package chapter6.ColorPoint;

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
	public String show() {
		StringBuffer sb = new StringBuffer("(");
		sb.append(x); sb.append(", "); sb.append(y); sb.append(")");
		String s = sb.toString();
		return s;
	}
	
}
