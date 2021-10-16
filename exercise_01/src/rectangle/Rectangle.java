package rectangle;


public class Rectangle {
	Point lt;
	Point rb;
	
	public Rectangle(int x1, int y1, int x2, int y2){
		this(new Point(x1, y1), new Point(x2, y2));
	}
	public Rectangle(Point lt, Point rb){
		if(lt.getX() > rb.getX() || lt.getY() > rb.getY()) System.out.println("잘못된 값입니다.");
		else {
			this.lt = lt;
			this.rb = rb;
		}
	}
	
	public int getWidth(){
		return rb.getX() - lt.getX();
	}
	public int getHeight(){
		return rb.getY() - lt.getY();
	}
	public int getRound() {
		return 2 * (getWidth() + getHeight());
	}
	public int getArea() {
		return getWidth() * getHeight();
	}
	public void show() {
		System.out.println();
		System.out.print("[");
		if(getWidth() == getHeight()) System.out.print("정");
		else System.out.print("직");
		System.out.print("사각형 " + getWidth() + "x" + getHeight() + ": ");
		System.out.println(lt.show() + ", " + rb.show() + "]");
	}
}
