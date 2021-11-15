package textbook.ex13;

public interface Shape {
	final double PI = 3.14;
	void draw();
	double getArea();
	default void redraw() {
		System.out.print("�ٽ� �׸��ϴ�.");
		draw();
	}
}
