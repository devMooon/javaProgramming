package textbook.ex13;

public class Circle implements Shape {
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("�������� " + radius + "�� ���Դϴ�.");

	}

	@Override
	public double getArea() {
		return radius * radius * this.PI;
	}

}
