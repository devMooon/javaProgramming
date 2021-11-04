package chapter4.circle;

public class main {

	public static void main(String[] args) {
		Circle [] circles = new Circle[5];
		
		for(int i = 0; i < circles.length; i++) {
			circles[i] = new Circle(i);
		}
		for(Circle c: circles) {
			System.out.println("반지름 " + c.getRadius() + "인 원의 면적 : " + (int)c.getArea());
		}
	}

}
