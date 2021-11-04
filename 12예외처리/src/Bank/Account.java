package Bank;

public class Account {
	String accountNo; //계좌번호
	String name; //예금주 이름
	int balance; //잔액
	
	public Account(String accountNo, String name, int balance){
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	void deposit(int amount) throws Exception { //예금하기
		if(amount < 0) throw new MalformedData();
		else balance += amount;
	}
	int withdraw(int amount) throws Exception { //인출하기
		if(amount < 0) {
			throw new MalformedData();
		}
		if(amount > balance) {
			throw new BalanceOutOfBoundsException();
		}
		
		balance -= amount;
		return amount;
	}
	void check() { //잔액조회(출력)하기
		System.out.println("현재 잔액: " + balance);
	}
}
