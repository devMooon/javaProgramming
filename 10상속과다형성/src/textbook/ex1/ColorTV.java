package textbook.ex1;


public class ColorTV extends TV {
	private int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.println(this.getSize() + "��ġ " + this.color + "�÷�");
	}
}