package ��Ӱ�������;

public class Rectangle extends Polygon {

	public Rectangle(int x, int y, int w, int h) {
		super(x, y, w, h, "Rectangle");
		if(isSquare()) this.type = "Square"; //�³�..?
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
