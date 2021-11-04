package Bank;

public class MalformedData extends Exception {
	
	MalformedData() {
		super("오류: 잘못된 금액입니다.");
	}
}
