package lotto;

public class LottoCard {
	private Lotto[] lotto = new Lotto[5];
	private int size = 0;
	
	public LottoCard(){
		this(5);
	}
	
	public LottoCard(int size){
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void number_auto_generated() {
		for (int i = 0; i < size; i++) {
			lotto[i] = new Lotto();
			lotto[i].generate();
		}
	}
	
	public void number_manual_generated() {
		for (int i = 0; i < size; i++) {
			lotto[i] = new Lotto();
			lotto[i].setNum();
		}
	}
	
	public void show() {
		for (int i = 0; i < size; i++) {
			lotto[i].show();
		}
	}
}
