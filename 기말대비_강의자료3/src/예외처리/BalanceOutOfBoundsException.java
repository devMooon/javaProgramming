package 예외처리;

public class BalanceOutOfBoundsException extends RuntimeException {
	@Override
	public String getMessage() {
		return "인출오류: 잔액을 초과하하였습니다.";
	}
}
