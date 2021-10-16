package ex.lotto;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	Scanner s = new Scanner(System.in);
	Random r = new Random();
	
	private int[] lottoNumber = new int[6];
	private int size = 6;
	private boolean isValid;
	
	Lotto() {}
	Lotto(int n1, int n2, int n3, int n4, int n5, int n6) {this(new int[] {n1, n2, n3, n4, n5, n6});}
	Lotto(int[] lottoNumber) {
		this.lottoNumber = lottoNumber;
		for (int i = 0; i < lottoNumber.length; i++) {
			if(!verify(i)) {
				isValid = false;
				System.out.println("(fail)");
			}
		}
		isValid = true;
		System.out.println("(succese)");
	}
	
	private boolean verify(int index) {
		for(int i = 0; i < index; i++) {
			if( lottoNumber[index] == lottoNumber[i]) {
				return false;
			}
		}
		return true;
	}
	//유효 번호의 자동 생성
	public void generate() {
		for (int i = 0; i < lottoNumber.length; i++) {
			lottoNumber[i] = r.nextInt(45) + 1;
			if(!verify(i)) i--;
		}
		isValid = true;
	}

	public void setNum() {
		System.out.println("로또 번호 값을 입력하세요. (1~45중에 중복 없이 작성)");
		for (int i = 0; i < 6; i++) {
			System.out.print(i + 1 + "번 값 : ");
			lottoNumber[i] = s.nextInt();
			if(!verify(i) || (lottoNumber[i] < 1 || lottoNumber[i] > 45)) {
				System.out.println("값 입력 오류!");
				i--;
				continue;
			}
		}
		isValid = true;
	}
			
	//번호 출력(범위/중복여부) 유효한 번호가 설정된 경우에만 출력, 그렇지 않으면 오류 메시지 출력
	public void show() {
		if (isValid) System.out.println("설정된 로또 번호");
		else System.out.println("유효하지 않은 범위의 값이 있습니다.");

		for (int n : lottoNumber) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	//로또 번호를 반환, 설정된 번호가 유효하지 않은 경우 null반환
	public int[] getNumbers() {
		if (isValid) {
			return lottoNumber;
		}
		else {
			System.out.print("유효하지 않은 범위의 값이 있습니다.");
			return null;
		}
	}

}
