package ex.hw;

import ex.lottoShop.LottoShop;
import ex.person.Person;

public class LottoSim {

	public static void main(String[] args) {
		LottoShop shop = new LottoShop();
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.buyLotto(shop, 5000, "자동");
		p1.show();
		
		p2.buyLotto(shop, 3000, "수동");
		p2.show();
	}

}
