package ex.lottoShop;

import ex.lotto.LottoCard;

public class LottoShop {
	public int incomeMoney = 0;
	final int LOTTO = 1000;
	
	public int buy(int receivedMoney, String howToBuy, LottoCard loca) {
		loca.setSize(receivedMoney/LOTTO);
		incomeMoney += receivedMoney/LOTTO;
		
		if(howToBuy == "¼öµ¿") loca.number_manual_generated();
		else loca.number_auto_generated();
		
		return receivedMoney%LOTTO;
	}
}
