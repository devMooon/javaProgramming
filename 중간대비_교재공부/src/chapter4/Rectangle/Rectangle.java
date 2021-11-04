package chapter4.Rectangle;

public class Rectangle {
	Point lt;
	Point rb;
	
	Rectangle(int x1, int y1, int x2, int y2){
		Point lt = new Point(x1, y1);
		Point rb = new Point(x2, y2);
		this.lt = lt;
		this.rb = rb;
	}
	Rectangle(Point lt, Point rb){
		this.lt = lt;
		this.rb = rb;
	}
	
	int getWidth() {
		return rb.getX() - lt.getX();
	}
	int getHeight() {
		return rb.getY() - lt.getY();
	}
	int square() {
		return getWidth() * getHeight();
	}
	void show() {
		System.out.println(lt.show() + "과 " + rb.show() + "에서 크기가 " + getWidth() + "x" + getHeight() +"인 사각형");
	}
	boolean contains(Rectangle r) {
		if(r.lt.getX() >= lt.getX() && r.rb.getX() <= rb.getX()) {
			if(r.lt.getY() >= lt.getY() && r.rb.getY() <= rb.getY()) {
				if(r.rb.getX() >= lt.getX() && r.rb.getX() <= rb.getX()) {
					if(r.lt.getY() >= lt.getY() && r.rb.getY() <= rb.getY()) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
