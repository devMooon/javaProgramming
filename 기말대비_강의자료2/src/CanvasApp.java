import �߻�Ŭ����.hw.polygon.Canvas;
import �߻�Ŭ����.hw.polygon.Rectangle;
import �߻�Ŭ����.hw.polygon.Square;
import �߻�Ŭ����.hw.polygon.Triangle;

public class CanvasApp {

	public static void main(String[] args) {
		Canvas canvas = new Canvas(4);
		
		canvas.draw(new Rectangle(3, 4, 10, 10));
		canvas.draw(new Rectangle(5, 5, 4, 5));
		canvas.draw(new Square(3, 2, 5));
		canvas.draw(new Triangle(3, 2, 10, 2));
		canvas.draw(new Triangle(3, 2, 10, 2));
		canvas.draw(new Triangle(3, 2, 10, 2));
		
		canvas.display();
	}

}
