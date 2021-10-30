package hw.polygon;

public class Square extends Rectangle {
	private int lenght;
	
	public Square(int x, int y, int length) {
		super(x, y, length, length);

		this.type = "Square";
	}
	
}
