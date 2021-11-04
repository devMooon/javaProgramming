package chapter5.Point;

public class PointTest {

	public static void main(String[] args) {
		Point p1 = new Point(2, 3);
		Point p2 = new Point(1, 3);
		Point p3 = new Point(2, 3);
		
		System.out.print("p1과 p2가 ");
		if(p1.equals(p2)) System.out.println("같습니다.");
		else System.out.println("다릅니다.");
		
		System.out.print("p1과 p3가 ");
		if(p1.equals(p3)) System.out.println("같습니다.");
		else System.out.println("다릅니다.");
	}

}
