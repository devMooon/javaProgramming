package chapter4.Rectangle;

public class main {

	public static void main(String[] args) {
		Point p1 = new Point(5, 5); Point p2 = new Point(6, 6);
		Point p3 = new Point(0, 0); Point p4 = new Point(6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(p1, p2);
		Rectangle m = new Rectangle(p3, p4);
		
		
		r.show();
		System.out.println("s�� ������" + s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
		if(t.contains(m)) System.out.println("t�� m�� �����մϴ�.");
	}

}
