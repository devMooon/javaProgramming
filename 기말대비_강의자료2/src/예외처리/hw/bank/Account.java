package ����ó��.hw.bank;

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
		if(amount < 0) throw new MalformedData("����: �߸��� �ݾ��Դϴ�.");
		balance += amount;
	}
	public int withdraw(int amount) throws MalformedData, BalanceOutOfBoundsException {
		if(amount < 0) throw new MalformedData("����: �߸��� �ݾ��Դϴ�.");
		if(amount > balance) throw new BalanceOutOfBoundsException("�������: �ܾ��� �ʰ��Ͽ����ϴ�.");
		balance -= amount;
		return amount;
	}
	public void check() {
		System.out.println(name + " ������ '" + accountNo + "'���� �ܾ�: " + balance);
	}
}
