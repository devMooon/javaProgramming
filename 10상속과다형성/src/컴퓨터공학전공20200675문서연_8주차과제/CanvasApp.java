import hw.polygon.Canvas;
import hw.polygon.Rectangle;
import hw.polygon.Square;
import hw.polygon.Triangle;

public class CanvasApp {

	public static void main(String[] args) {
		Canvas canvas = new Canvas(10);
		
		canvas.draw(new Triangle(3, 3, 10, 10)); //0
		canvas.draw(new Triangle(3, 3, 10, 10)); //1
		canvas.draw(new Triangle(1, 3, 2, 4)); //2
		canvas.draw(new Rectangle(2, 2, 10, 10)); //3
		canvas.draw(new Rectangle(3, 5, 10, 10)); //4
		canvas.draw(new Rectangle(2, 2, 5, 10)); //5
		canvas.draw(new Square(1, 2, 5)); //6
		canvas.draw(new Square(4, 2, 5)); //7
		canvas.draw(new Square(3, 4, 3)); //8
		
		canvas.display();
		
		canvas.polygons[0].equals(canvas.polygons[1]); //같
		canvas.polygons[0].equals(canvas.polygons[2]); //다
		
		canvas.polygons[3].equals(canvas.polygons[4]); //같
		canvas.polygons[3].equals(canvas.polygons[5]); //다
		
		canvas.polygons[6].equals(canvas.polygons[7]); //같
		canvas.polygons[6].equals(canvas.polygons[8]); //다
		
	}

}
