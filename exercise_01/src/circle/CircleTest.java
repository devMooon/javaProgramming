package circle;

public class CircleTest {
	static public void print(Circle c) {
		System.out.println("반지름이 " + c.getRadius() + "인 원의 둘레는 " + c.getRound() + "이고, 넓이는 " + c.getArea() + ".");	
		//모든 객체는 동적으로 할당되기 때문에 값이 변경되는 것 확인
		c.setRadius(0);
	}
	
	
	public static void main(String[] args) {
		Circle c10 = new Circle();
		c10.setRadius(10);
		
		Circle c20 = new Circle(20);
		
		print(c10);
		print(c20);
		
		//모든 원 객체의 반지름이 0으로 할당됨
		print(c10);
		print(c20);
	}

}
