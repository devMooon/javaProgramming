package practice3;
//��ǻ�Ͱ������� 20200675 ������
public class Point {
	private double x;
	private double y;
	
	public Point() {
		this(0, 0);
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//Ŭ������ public�̸� �޼��嵵 public!
	public void setXY(double x, double y) {
		//�߸��� ���̸� ���� �޽���
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void show() {
		System.out.println("(" + x + "," + y +")");
	}
}
