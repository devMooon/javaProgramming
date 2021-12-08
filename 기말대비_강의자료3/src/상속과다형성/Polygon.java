package 상속과다형성;

public abstract class Polygon {
	
	protected int x, y;
	protected int w, h;
	protected String type;
	
	public Polygon(int x, int y, int w, int h, String type) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.type = type;
	}
	
	public abstract double getArea();
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Polygon) {
			Polygon r = (Polygon)obj;
			if(this.x == r.x && this.y == r.y && 
					this.w == r.w && this.h == r.h && this.type == r.type) {
				return true;
			}
			else return false;
		}
		else return false;
		
	}
	void show() {
		System.out.println(type + "(" + x + ", " + y + ")[" + w + "x" + h + "/" + getArea() + "]");
	}
	
}
