package rectangle;

public class RectangleTest {
	public static void show(Rectangle r) {
		r.show();
		System.out.print("≥–¿Ã: " + r.getArea());
		System.out.print(", ");
		System.out.println("µ—∑π: " + r.getRound() + "\n");
	}
	
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(0, 0, 10, 5);
		RectangleTest.show(rect1);
		
		Rectangle rect2 = new Rectangle(new Point(0, 0), new Point(5, 10));
		RectangleTest.show(rect2);
	}

}
