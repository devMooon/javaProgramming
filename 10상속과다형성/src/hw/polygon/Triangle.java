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
			
			System.out.print("두 삼각형은 ");
			if(w == r.w && h == r.h ) {
				System.out.println("같습니다.");
				return true;
			}
			else {
				System.out.println("다릅니다.");
				return false;
			}
		}
		else {
			System.out.print("같은 타입을 비교하세요.");
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
		System.out.println(" 넓이: " + getArea());
	}
	
	
}
