package 예외처리.hw.bank;

import java.util.Iterator;
import java.util.Vector;

public class Bank {

	public static void main(String[] args) {
		Vector<Account> account = new Vector<Account>();
		
		account.add(new Account("001", "Kim", 0));
		account.add(new Account("002", "Lee", -100));
		account.add(new Account("003", "Park", 5000));
		account.add(new Account("004", "Moon", -1));
		account.add(new Account("005", "Seo", 2300));
		
		Iterator<Account> itr = account.iterator();
		
		while(itr.hasNext()) {
			itr.next().check();
		}
		
		try {
			System.out.println("\n\n입금 테스트");
			//account.get(0).deposit(-1);
			account.get(0).deposit(5000);
			account.get(0).check();
			
			System.out.println("\n\n출금 테스트");
			//account.get(0).withdraw(50000);
			//account.get(0).withdraw(-1000);
			account.get(0).withdraw(1000);
			account.get(0).check();
			
		} catch (BalanceOutOfBoundsException e) {
			System.err.println(e.getMessage());
		} catch (MalformedData e) {
			System.err.println(e.getMessage());
		}
		finally {
			itr = account.iterator();
			
			System.out.println("\n\n최종 결과입니다.");
			while(itr.hasNext()) {
				itr.next().check();
			}
		}
	}

}
