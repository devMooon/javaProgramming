package textbook.ex11;

public class Div extends Calc {

	public Div(int x, int y) {
		super(x, y);
	}

	@Override
	public int calculate() {
		return a / b;
	}

}
