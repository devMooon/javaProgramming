package hw.polygon;

public class Triangle extends Polygon {

	public Triangle(int x, int y, int w, int h) {
		super(x, y, w, h);
		
		this.type = "Triangle";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Triangle) {
			Triangle r = (Triangle) obj;
			
			System.out.print("�� �ﰢ���� ");
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
		return w * h / 2;
	}

	@Override
	public void show() {
		super.show();
		System.out.println(" ����: " + getArea());
	}
	
	
}
