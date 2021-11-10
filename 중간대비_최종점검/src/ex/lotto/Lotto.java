package ex.lotto;

import java.util.Random;

public class Lotto {
	Random r = new Random();
	
	private int[] lottoNumber = new int[6];
	boolean isValid; //현재 배열에 설정된 숫자들이 유효한지
		
	public Lotto() {
		this.generate();
	}
	public Lotto(int n1, int n2, int n3, int n4, int n5, int n6) {
		this(new int[] {n1, n2, n3, n4, n5, n6});
	}
	public Lotto(int[] lottoNumber) {
		this.lottoNumber = lottoNumber;
		if(!verify()) System.out.println("잘못된 로또 번호가 있습니다..");
	}
	
	public boolean verify() {//설정된 번호의 유효성 검사
		for(int i = 0; i < lottoNumber.length; i++) {
			
			if(lottoNumber[i] >= 1 && lottoNumber[i] <= 45) {
				
				for(int k = i+1; k < lottoNumber.length; k++) {
					
					if(lottoNumber[i] == lottoNumber[k]) {
						isValid = false;
						return false; //중복값 있음
					}
				}
				//요소 하나만 통과라 리턴값 없음..
			}
			else {
				isValid = false;
				return false;//숫자 범위 오류
			}
		}
		isValid = true;
		return true; //다 통과
	}
	
	public void show() {
		if(isValid) {
			System.out.print("로또 번호 : ");
			for(int n : lottoNumber) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		else {
			System.out.println("잘못된 로또 번호 입니다.");
		}
	}
	
	public int[] getNumbers() {
		if(isValid) {
			return lottoNumber;
		}
		else {
			return null;
		}
	}
	
	public void generate() {
		for(int i = 0; i < lottoNumber.length; i++) {
			lottoNumber[i] = r.nextInt(45)+1;
			for(int k = 0; k < i; k++) {
				if(lottoNumber[i] == lottoNumber[k]) {
					i--;
					break;
				}
			}
		}
		isValid = true;
	}
}
