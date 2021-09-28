package practice3;
//��ǻ�Ͱ������� 20200675 ������
public class Rectangle {
	Point left_top;
	Point right_bottom;
	
	public Rectangle(double x1, double y1, double x2, double y2) {
		this(new Point(x1, y1), new Point(x2, y2));
	}
	
	public Rectangle(Point p1, Point p2) {
		//��� left_top = new Point(p1.getX(), p1.getY());
		left_top = p1;
		right_bottom = p2;
	}
	
	public double getWidth() {
		return right_bottom.getX() - left_top.getX();
	}
	
	public double getHeight() {
		return right_bottom.getY() - left_top.getY();
	}
	
	public double getCircumference() {
		return 2 * (getWidth() + getHeight());
	}
	
	public double getArea() {
		return getWidth() * getHeight();
	}
	
	public void show() {
		System.out.println("[���簢�� " + getWidth() + " x " + getHeight() + " : (" + left_top.getX()+", " + left_top.getY() + "), " + "(" + right_bottom.getX() + ", " + right_bottom.getY() + ")]");
	}
}
