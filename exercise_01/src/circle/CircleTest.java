package circle;

public class CircleTest {
	static public void print(Circle c) {
		System.out.println("�������� " + c.getRadius() + "�� ���� �ѷ��� " + c.getRound() + "�̰�, ���̴� " + c.getArea() + ".");	
		//��� ��ü�� �������� �Ҵ�Ǳ� ������ ���� ����Ǵ� �� Ȯ��
		c.setRadius(0);
	}
	
	
	public static void main(String[] args) {
		Circle c10 = new Circle();
		c10.setRadius(10);
		
		Circle c20 = new Circle(20);
		
		print(c10);
		print(c20);
		
		//��� �� ��ü�� �������� 0���� �Ҵ��
		print(c10);
		print(c20);
	}

}
