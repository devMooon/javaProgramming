package ex.lotto;

import java.util.Scanner;

public class LottoCard {
	Scanner s = new Scanner(System.in);
	
	private static final int MIN = 1;
	private static final int MAX = 5;
	private Lotto[] lotto;
	private int n; //로또 번호의 개수
	
	public LottoCard(){
		this(MIN);
	}
	public LottoCard(int n){
		if(n > MAX) {
			System.out.println("로또는 하루에 5장만 구매 가능합니다. 5개만 드릴게요 --;");
			n = 5;
		}
		lotto = new Lotto[n]; //참조변수의 배열 선언 -> 객체 선언 해야됨!!
		this.n = n;		
	}
	public void ManualSet() {
		for(int i = 0; i < lotto.length; i++) {
			int[] nums = new int[6];
			System.out.println((i+1) + "번째 로또 번호 6개를 순서대로 입력해주세요. (띄어쓰기로 구분)");
			for(int k = 0; k < nums.length; k++) {
				nums[k] = s.nextInt();
			}
			lotto[i] = new Lotto(nums);
		}
	}
	public void AutomaticSet() {
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = new Lotto();
		}
	}
	public void show() {
		for(int i = 0; i < lotto.length; i++) {
			System.out.print((i+1) + "번 ");
			lotto[i].show();
		}
	}
}
