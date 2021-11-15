package textbook.ex11;

public class Add extends Calc {

	public Add(int x, int y) {
		super(x, y);
	}

	@Override
	public int calculate() {
		return a + b;
	}

}
