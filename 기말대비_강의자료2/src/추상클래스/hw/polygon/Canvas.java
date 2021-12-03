package 추상클래스.hw.polygon;

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
			System.err.println(e.getMessage() + " 배열이 꽉 찼습니다.");
		}
		
	}
	public void display() {
		for(int i = 0; i < validSize; i++) {
			polygons[i].show();
		}
	}

}
