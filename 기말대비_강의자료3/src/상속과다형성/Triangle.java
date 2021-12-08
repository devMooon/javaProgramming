package 상속과다형성;

public class Triangle extends Polygon {

	public Triangle(int x, int y, int w, int h) {
		super(x, y, w, h, "Triangle");
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return w * h / 2;
	}

}
