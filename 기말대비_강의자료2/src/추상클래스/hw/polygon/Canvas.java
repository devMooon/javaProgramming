package �߻�Ŭ����.hw.polygon;

public class Canvas {

	private int length;
	private int validSize;
	private Polygon[] polygons;
	
	public Canvas(int length) {
		validSize = 0;
		this.length = length;
		polygons = new Polygon[length];
	}
	
	public void draw(Polygon polygon) {
		try {
			polygons[validSize] = polygon;
			validSize++;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage() + " �迭�� �� á���ϴ�.");
		}
		
	}
	public void display() {
		for(int i = 0; i < validSize; i++) {
			polygons[i].show();
		}
	}

}
