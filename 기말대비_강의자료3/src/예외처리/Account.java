package 예외처리;

public class Account {
	private String account;
	private String name;
	private int balance;
	
	public Account(String account, String name) {
		this.account = account;
		this.name = name;
		this.balance = 0;
	}
	
	public void deposit(int amount) throws MalformendDataException {
		if(amount < 0) throw new MalformendDataException();
		balance += amount;
	}
	
	public int withdraw(int amount) throws MalformendDataException, BalanceOutOfBoundsException {
		if(amount < 0) throw new MalformendDataException();
		else if (amount > balance) throw new BalanceOutOfBoundsException();
		balance -= amount;
		return amount;
		
	}
	
	public void check() {
		System.out.println(name + "[" + account + "]의 잔액: " + balance +"원");
	}
}
