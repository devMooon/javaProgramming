package textbook.ex5;

public class Point3D extends Point {
	private int z;
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	public String toString() {
		return "(" + super.getX() + "," + super.getY() + "," + z + ")ÀÇ Á¡";
	}
	public void moveUp() { z++; }
	public void moveDown() { z--; }
	public void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
}
