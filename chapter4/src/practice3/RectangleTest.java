package practice3;
//컴퓨터공학전공 20200675 문서연
public class RectangleTest {
	static void show(Rectangle r) {
		r.show();
		System.out.print("넒이: " + r.getArea());
		System.out.print(" , ");
		System.out.println("둘레: " + r.getCircumference());
	}
	
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(0, 0, 10, 5);
		RectangleTest.show(rect1);
		
		System.out.println();
		
		Rectangle rect2 = new Rectangle(new Point(0, 0), new Point(5, 10));
		RectangleTest.show(rect2);
	}

}
