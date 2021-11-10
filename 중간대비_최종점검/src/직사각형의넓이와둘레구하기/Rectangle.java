package 직사각형의넓이와둘레구하기;

public class Rectangle {
	private Point lt;
	private Point rb;
	
	public Rectangle() {
		this(0, 0, 0, 0);
	}
	public Rectangle(int x1, int y1, int x2, int y2) {
		this(new Point(x1, y1), new Point(x2, y2));
	}
	public Rectangle(Point lt, Point rb) {
		this.lt = lt;
		this.rb = rb;
	}
	public int getWidth() {
		return rb.getX() - lt.getX();
	}
	public int getHeight() {
		return rb.getY() - lt.getY();
	}
	public int getRound() {
		return (getWidth() + getHeight()) * 2;
	}
	public int getArea() {
		return getWidth() * getHeight();
	}
	public void show() {
		System.out.print("[직사각형 " + getWidth() + "x" + getHeight() + ": ");
		System.out.println(lt.show() + ", " + rb.show() + "]");
	}
}
