package Bank;

public class BalanceOutOfBoundsException extends RuntimeException {
	
	BalanceOutOfBoundsException(){
		super("인출오류: 잔액을 초과하였습니다.");
	}
}
