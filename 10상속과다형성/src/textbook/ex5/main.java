package textbook.ex5;

public class main {

	public static void main(String[] args) {
		System.out.println("문제 5.");
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println( str + "입니다." );
		
		System.out.println("\n문제 6.");
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString() + "입니다." );
		
		ColorPoint cp2 = new ColorPoint(10, 10);
		cp2.setXY(5, 5);
		cp2.setColor("RED");
		System.out.println( cp2.toString() + "입니다." );
		
		System.out.println("\n문제 7.");
		
		Point3D p = new Point3D(1, 2, 3);
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();
		System.out.println(p.toString() + "입니다.");
		
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(100, 200, 300);
		System.out.println(p.toString() + "입니다.");
		
		System.out.println("\n문제 8.");
		PositivePoint p2 = new PositivePoint();
		p2.move(10, 10);
		System.out.println(p2.toString() + "입니다.");
		
		p2.move(-5, 5);
		System.out.println(p2.toString() + "입니다.");
		
		PositivePoint p3 = new PositivePoint(-10, -10);
		System.out.println(p3.toString() + "입니다.");
		
		
		
		

	}

}
