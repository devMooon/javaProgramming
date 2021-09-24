package practice3;

public class Rectangle {
	Point left_top;
	Point right_bottom;
	double width = 0;
	double height = 0;
	double circumference;
	double area;
	
	Rectangle (double x1, double y1, double x2, double y2) {
		left_top = new Point(x1, y1);
		right_bottom = new Point(x2, y2);
		getWidth();
		getHeight();
	}
	
	Rectangle (Point p1, Point p2) {
		left_top = p1;
		right_bottom = p2;
		getWidth();
		getHeight();
	}
	
	double getWidth() {
		width = right_bottom.getX() - left_top.getX();
		return width;
	}
	double getHeight() {
		height = right_bottom.getY() - left_top.getY();
		return height;
	}
	double getCircumference() {
		circumference = 2 * (width + height);
		return circumference;
	}
	double getArea() {
		area = width * height;
		return area;
	}
	void show() {
		System.out.println("[직사각형 " + width +"x"+height+": (" +left_top.getX()+", " + left_top.getY() + "), "+"(" +right_bottom.getX()+", " + right_bottom.getY() + ")]");
	}
}
