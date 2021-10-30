package hw.polygon;

public abstract class Polygon {
	protected int x;
	protected int y;
	protected int w;
	protected int h;
	
	protected String type;
	
	protected Polygon(int x, int y, int w, int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
	protected void show() {
		System.out.print(type + "(" + x + ", " + y +")\t 폭: " + w + " 높이: " + h);
	}
	
	//파생클래스에서 넓이 계산을 강제화하기 위한 추상 메서드
	abstract double getArea();
}
