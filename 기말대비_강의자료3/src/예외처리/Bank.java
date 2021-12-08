package 예외처리;

import java.util.Iterator;
import java.util.Vector;

public class Bank {

	public static void main(String[] args) {
		Vector<Account> v = new Vector<Account>();
		
		v.add(new Account("000-001", "moon1"));
		v.add(new Account("000-002", "moon2"));
		v.add(new Account("000-003", "moon3"));
		v.add(new Account("000-004", "moon4"));
		v.add(new Account("000-005", "moon5"));
		v.add(new Account("000-006", "moon6"));
		
		try {
			//v.get(0).deposit(-10);
			v.get(1).deposit(1000);
			//v.get(2).withdraw(-10);
			//v.get(2).withdraw(1000);
			v.get(1).withdraw(1000);
		} catch (MalformendDataException e) {
			System.err.println(e.getMessage());
		} catch (BalanceOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("\n결과");
		Iterator<Account> itr = v.iterator();
		while(itr.hasNext()) {
			itr.next().check();
		}
		
	}

}
