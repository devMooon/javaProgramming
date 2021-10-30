package hw.polygon;

public class Canvas {
	public Polygon[] polygons;
	private int count = 0;

	public Canvas(int size){
		polygons = new Polygon[size];
	}
	
	public void draw(Polygon p) {
		polygons[count++] = p;
	}
	
	public void display() {
		for(Polygon ps: polygons) {
			if(ps != null) ps.show();
		}
	}
}
