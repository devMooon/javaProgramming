import ��Ӱ�������.Canvas;
import ��Ӱ�������.Rectangle;
import ��Ӱ�������.Square;
import ��Ӱ�������.Triangle;

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
