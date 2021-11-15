package textbook.ex5;

public class ColorPoint extends Point {
	private String string;
	
	public ColorPoint() {
		super();
		this.string = "BLACK";
	}
	public ColorPoint(int x, int y) {
		super(x, y);
		this.string = "BLACK";
	}
	public ColorPoint(int x, int y, String string) {
		super(x, y);
		this.string = string;
	}
	
	public void setXY(int x, int y) {
		super.move(x, y);
	}
	public void setColor(String string) {
		this.string = string;
	}
	public String toString() {
		return string + "색의 (" + super.getX() + "," + super.getY() + ")의 점";
	}
	

}
