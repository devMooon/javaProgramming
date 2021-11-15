package textbook.ex5;

public class PositivePoint extends Point {
	public PositivePoint() {
		super();
	}
	public PositivePoint(int x, int y) {
		super();
		if(x >= 0 && y >= 0) super.move(x, y);
	}

	@Override
	protected void move(int x, int y) {
		if(x >= 0 && y >= 0) super.move(x, y);
	}
	public String toString() {
		return "(" + super.getX() + "," + super.getY() + ")ÀÇ Á¡";
	}
}
