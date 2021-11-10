package 직사각형의넓이와둘레구하기;

public class test {
	public static void show(Rectangle r) {
		r.show();
		System.out.print("넓이: " + r.getArea() + ", ");
		System.out.println("둘레: " + r.getRound());
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(0, 0, 10, 5);
		Rectangle r2 = new Rectangle(new Point(0, 0), new Point(5, 10));
		
		show(r1);
		System.out.println();
		show(r2);
	}

}
