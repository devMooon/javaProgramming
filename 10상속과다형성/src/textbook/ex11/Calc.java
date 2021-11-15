package textbook.ex11;

public abstract class Calc {
	protected int a;
	protected int b;
	public Calc(int x, int y) { this.setValue(x, y); }
	private void setValue(int x, int y) {
		this.a = x;
		this.b = y;
	}
	abstract public int calculate();
	
}
