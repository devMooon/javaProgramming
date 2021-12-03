package 추상클래스.hw.polygon;

public class Triangle extends Polygon {
	
	public Triangle(int x, int y, int w, int h) {
		super(x, y, w, h);
		this.type = new String("Triangle");
	}

	@Override
	public double getArea() {
		return this.x * this.y / 2; 
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Triangle) {
			Triangle r = (Triangle)obj;
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
		System.out.println("Area: " + this.getArea());
	}
}
