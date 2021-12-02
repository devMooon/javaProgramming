package 예외처리.hw.bank;

public class BalanceOutOfBoundsException extends RuntimeException {
	private String msg;
	
	public BalanceOutOfBoundsException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}
}
