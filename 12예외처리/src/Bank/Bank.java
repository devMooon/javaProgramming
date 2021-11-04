package Bank;

public class Bank {

	public static void main(String[] args) {
		Account account[] = new Account[5];
		
		account[0] = new Account("000-001", "������1", 10000);
		account[1] = new Account("000-002", "������2", 20000);
		account[2] = new Account("000-003", "������3", 30000);
		account[3] = new Account("000-004", "������4", 40000);
		account[4] = new Account("000-005", "������5", 50000);
	
		for(Account ac: account) {
			try {
				ac.deposit(-1000);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
			try {
				ac.withdraw(20000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			ac.check();
		}
	}
}
