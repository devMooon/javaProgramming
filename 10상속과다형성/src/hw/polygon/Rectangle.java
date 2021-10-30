package hw.polygon;

public class Rectangle extends Polygon {
	
	public Rectangle(int x, int y, int w, int h) {
		super(x, y, w, h);

		if(isSquare()) type = "Square";
		else type = "Rectangle";
	}
	

	boolean isSquare() {
		if(w == h) return true;
		else return false;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle r = (Rectangle) obj;
			
			System.out.print("�� �簢���� ");
			if(w == r.w && h == r.h ) {
				System.out.println("�����ϴ�.");
				return true;
			}
			else {
				System.out.println("�ٸ��ϴ�.");
				return false;
			}
		}
		else {
			System.out.print("���� Ÿ���� ���ϼ���.");
			return false;
		}
	}

	@Override
	double getArea() {
		return w * h;
	}

	@Override
	public void show() {
		super.show();
		System.out.println(" ����: " + getArea());
	}
	
	
}
