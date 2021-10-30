package hw.polygon;

public abstract class Polygon {
	protected int x;
	protected int y;
	protected int w;
	protected int h;
	
	protected String type;
	
	protected Polygon(int x, int y, int w, int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
	protected void show() {
		System.out.print(type + "(" + x + ", " + y +")\t ��: " + w + " ����: " + h);
	}
	
	//�Ļ�Ŭ�������� ���� ����� ����ȭ�ϱ� ���� �߻� �޼���
	abstract double getArea();
}
