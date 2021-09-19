package practice1;

public class CircleTest {

	public static void main(String[] args) {
		Circle c10 = new Circle();
		c10.setRadius(5);
		System.out.println("반지름이 " + c10.radius + "인 원의 넓이는 " + c10.getArea() + "입니다.");
		System.out.println("반지름이 " + c10.radius + "인 원의 둘레는 " + c10.getCircumference() + "입니다.");
	}

}
