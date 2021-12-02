package 예외처리.hw.bank;

public class Account {
	private String accountNo;
	private String name;
	private int balance = 0;
	
	public Account(String accountNo, String name, int balance) {
		this.accountNo = accountNo;
		this.name = name;
		try {
			deposit(balance);
		} catch (MalformedData e) {
			System.err.println(e.getMessage());
		}
	}
	
	public void deposit(int amount) throws MalformedData {
		if(amount < 0) throw new MalformedData("오류: 잘못된 금액입니다.");
		balance += amount;
	}
	public int withdraw(int amount) throws MalformedData, BalanceOutOfBoundsException {
		if(amount < 0) throw new MalformedData("오류: 잘못된 금액입니다.");
		if(amount > balance) throw new BalanceOutOfBoundsException("인출오류: 잔액을 초과하였습니다.");
		balance -= amount;
		return amount;
	}
	public void check() {
		System.out.println(name + " 고객님의 '" + accountNo + "'계좌 잔액: " + balance);
	}
}
