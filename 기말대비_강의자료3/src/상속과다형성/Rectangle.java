package 상속과다형성;

public class Rectangle extends Polygon {

	public Rectangle(int x, int y, int w, int h) {
		super(x, y, w, h, "Rectangle");
		if(isSquare()) this.type = "Square"; //맞나..?
	}

	public boolean isSquare() {
		if(w == h) return true;
		else return false;
	}
	@Override
	public double getArea() {
		return w * h;
	}

}
