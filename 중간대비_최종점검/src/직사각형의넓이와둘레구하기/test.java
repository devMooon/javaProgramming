package ���簢���ǳ��̿͵ѷ����ϱ�;

public class test {
	public static void show(Rectangle r) {
		r.show();
		System.out.print("����: " + r.getArea() + ", ");
		System.out.println("�ѷ�: " + r.getRound());
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(0, 0, 10, 5);
		Rectangle r2 = new Rectangle(new Point(0, 0), new Point(5, 10));
		
		show(r1);
		System.out.println();
		show(r2);
	}

}
