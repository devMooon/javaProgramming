package chapter6.ColorPoint;

public class Color extends Point {
	private String color;
	
	Color(String color){
		super();
		this.color = color;
	}
	Color(int x, int y, String color){
		super(x, y);
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String show() {
		return color + super.show();
	}
}
