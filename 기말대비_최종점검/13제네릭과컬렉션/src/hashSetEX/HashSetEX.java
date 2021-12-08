package hashSetEX;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEX {

	public static void main(String[] args) {
		HashSet<Circle> circles = new HashSet<Circle>();
		
		circles.add(new Circle(2));
		circles.add(new Circle(4));
		circles.add(new Circle(5));
		circles.add(new Circle(4));
		
		Iterator<Circle> itr = circles.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
