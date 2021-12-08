import 상속과다형성.Canvas;
import 상속과다형성.Rectangle;
import 상속과다형성.Square;
import 상속과다형성.Triangle;

public class CanvasApp {

	public static void main(String[] args) {
		Canvas canvas = new Canvas(10);
		canvas.draw(new Rectangle(2, 2, 5, 10));
		canvas.draw(new Rectangle(2, 2, 10, 10));
		canvas.draw(new Triangle(10, 10, 5, 10));
		canvas.draw(new Square(10, 20, 5));
		
		canvas.display();

	}

}
