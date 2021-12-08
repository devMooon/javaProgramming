package hashSetEX;

public class Circle {
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Circle) {
			Circle c = (Circle)obj;
			
			if(this.radius == c.radius) return true;
			else return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return radius;
	}

	@Override
	public String toString() {
		return "¹ÝÁö¸§: " + radius;
	}
	
	
	
	
}
