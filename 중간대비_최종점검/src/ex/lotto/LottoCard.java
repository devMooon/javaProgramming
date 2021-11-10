package ex.lotto;

import java.util.Scanner;

public class LottoCard {
	Scanner s = new Scanner(System.in);
	
	private static final int MIN = 1;
	private static final int MAX = 5;
	private Lotto[] lotto;
	private int n; //�ζ� ��ȣ�� ����
	
	public LottoCard(){
		this(MIN);
	}
	public LottoCard(int n){
		if(n > MAX) {
			System.out.println("�ζǴ� �Ϸ翡 5�常 ���� �����մϴ�. 5���� �帱�Կ� --;");
			n = 5;
		}
		lotto = new Lotto[n]; //���������� �迭 ���� -> ��ü ���� �ؾߵ�!!
		this.n = n;		
	}
	public void ManualSet() {
		for(int i = 0; i < lotto.length; i++) {
			int[] nums = new int[6];
			System.out.println((i+1) + "��° �ζ� ��ȣ 6���� ������� �Է����ּ���. (����� ����)");
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
			System.out.print((i+1) + "�� ");
			lotto[i].show();
		}
	}
}
