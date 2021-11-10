package ex.hw;

import ex.lotto.LottoCard;

public class LottoSim {

	public static void main(String[] args) {
		LottoCard loca1 = new LottoCard(5);
		loca1.AutomaticSet();
		loca1.show();
		
		LottoCard loca2 = new LottoCard(3);
		loca2.ManualSet();
		loca2.show();
	}

}
