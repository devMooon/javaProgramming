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
			
			System.out.print("두 사각형은 ");
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
		return w * h;
	}

	@Override
	public void show() {
		super.show();
		System.out.println(" 넓이: " + getArea());
	}
	
	
}
