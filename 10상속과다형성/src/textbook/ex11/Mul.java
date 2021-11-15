package textbook.ex11;

public class Mul extends Calc {

	public Mul(int x, int y) {
		super(x, y);
	}

	@Override
	public int calculate() {
		return a * b;
	}

}
