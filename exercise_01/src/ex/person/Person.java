package ex.person;

import ex.lotto.LottoCard;
import ex.lottoShop.LottoShop;

public class Person {
	private int money = 5000;
	private LottoCard loca = new LottoCard();
	
	public void buyLotto(LottoShop shop, int spentMoney, String howToBuy) {
		money -= spentMoney;
		money += shop.buy(spentMoney, howToBuy, loca);
	}
	public void show() {
		loca.show();
	}
}