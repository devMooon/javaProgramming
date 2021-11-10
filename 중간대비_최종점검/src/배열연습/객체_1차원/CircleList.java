package �迭����.��ü_1����;

public class CircleList {
	Circle[] circles;
	
	CircleList(int size){
		circles = new Circle[size];
		for(int i = 0; i < circles.length; i++) {
			circles[i] = new Circle(i*2);
		}
	}
	void showList(){
		System.out.print("������ :\t");
		for(Circle cList : circles) {
			System.out.print(cList.getRadius() + "\t");
		}
		System.out.println();
		
		System.out.print("���� :\t");
		for(Circle cList : circles) {
			System.out.print(cList.getArea() + "\t");
		}
		System.out.println();
	}
}
