package 예외처리;

public class MalformendDataException extends Exception {
	@Override
	public String getMessage() {
		return "오류: 잘못된 금액입니다.";
	}
	
}
