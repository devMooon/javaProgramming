package chapter5.Point;

public class PointTest {

	public static void main(String[] args) {
		Point p1 = new Point(2, 3);
		Point p2 = new Point(1, 3);
		Point p3 = new Point(2, 3);
		
		System.out.print("p1�� p2�� ");
		if(p1.equals(p2)) System.out.println("�����ϴ�.");
		else System.out.println("�ٸ��ϴ�.");
		
		System.out.print("p1�� p3�� ");
		if(p1.equals(p3)) System.out.println("�����ϴ�.");
		else System.out.println("�ٸ��ϴ�.");
	}

}
