package ����ó��.hw.bank;

public class MalformedData extends Exception {
	private String msg;
	
	public MalformedData(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}
}
