package Bank;

public class Account {
	String accountNo; //���¹�ȣ
	String name; //������ �̸�
	int balance; //�ܾ�
	
	public Account(String accountNo, String name, int balance){
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	void deposit(int amount) throws Exception { //�����ϱ�
		if(amount < 0) throw new MalformedData();
		else balance += amount;
	}
	int withdraw(int amount) throws Exception { //�����ϱ�
		if(amount < 0) {
			throw new MalformedData();
		}
		if(amount > balance) {
			throw new BalanceOutOfBoundsException();
		}
		
		balance -= amount;
		return amount;
	}
	void check() { //�ܾ���ȸ(���)�ϱ�
		System.out.println("���� �ܾ�: " + balance);
	}
}
