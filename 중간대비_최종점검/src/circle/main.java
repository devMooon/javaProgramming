package circle;

public class main {

	public static void main(String[] args) {
		Circle c5 = new Circle();
		System.out.println("*** 1번 원 ***"); c5.show();
		
		Circle c10 = new Circle(10);
		System.out.println("*** 2번 원 ***"); c10.show();
		
		c5.setRadius(5);
		System.out.println("*** 반지름이 변경된 1번 원 ***"); c5.show();
	}

}
