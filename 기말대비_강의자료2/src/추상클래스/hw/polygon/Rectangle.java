package 추상클래스.hw.polygon;

public class Rectangle extends Polygon {

	public Rectangle(int x, int y, int w, int h) {
		super(x, y, w, h);
		if(isSquare()) this.type = new String("Square");
		else this.type = new String("Rectangle");
	}

	@Override
	public double getArea() {
		return this.x * this.y; 
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle r = (Rectangle)obj;
			if(x == r.x && y == r.y && w == r.w && h == r.h) return true;
			else return false;
		}
		else {
			return false;
		}
	}

	@Override
	public void show() {
		super.show();
		System.out.print("Area: " + this.getArea());
		if(isSquare()) System.out.println(" 정사각형 입니다.");
		else System.out.println(" 정사각형이 아닙니다.");
	}
	
	public boolean isSquare() {
		if(w == h) return true;
		else return false;
	}

}
