package circle;

public class main {

	public static void main(String[] args) {
		Circle c5 = new Circle();
		System.out.println("*** 1�� �� ***"); c5.show();
		
		Circle c10 = new Circle(10);
		System.out.println("*** 2�� �� ***"); c10.show();
		
		c5.setRadius(5);
		System.out.println("*** �������� ����� 1�� �� ***"); c5.show();
	}

}
