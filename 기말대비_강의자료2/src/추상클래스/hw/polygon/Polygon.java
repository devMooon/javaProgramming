package 추상클래스.hw.polygon;

public abstract class Polygon {
	protected int x, y;
	protected int w, h;
	protected String type;
	
	public Polygon(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	public abstract double getArea();
	public void show() {
		System.out.println("type: " + type + " x: " + x + " y: " + y + " w: " + w + " h: " + h);
	}
	
}
