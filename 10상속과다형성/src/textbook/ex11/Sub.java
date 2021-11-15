package textbook.ex11;

public class Sub extends Calc {

	public Sub(int x, int y) {
		super(x, y);
	}

	@Override
	public int calculate() {
		return a - b;
	}

}
