package ex.lotto;

import java.util.Random;

public class Lotto {
	Random r = new Random();
	
	private int[] lottoNumber = new int[6];
	boolean isValid; //���� �迭�� ������ ���ڵ��� ��ȿ����
		
	public Lotto() {
		this.generate();
	}
	public Lotto(int n1, int n2, int n3, int n4, int n5, int n6) {
		this(new int[] {n1, n2, n3, n4, n5, n6});
	}
	public Lotto(int[] lottoNumber) {
		this.lottoNumber = lottoNumber;
		if(!verify()) System.out.println("�߸��� �ζ� ��ȣ�� �ֽ��ϴ�..");
	}
	
	public boolean verify() {//������ ��ȣ�� ��ȿ�� �˻�
		for(int i = 0; i < lottoNumber.length; i++) {
			
			if(lottoNumber[i] >= 1 && lottoNumber[i] <= 45) {
				
				for(int k = i+1; k < lottoNumber.length; k++) {
					
					if(lottoNumber[i] == lottoNumber[k]) {
						isValid = false;
						return false; //�ߺ��� ����
					}
				}
				//��� �ϳ��� ����� ���ϰ� ����..
			}
			else {
				isValid = false;
				return false;//���� ���� ����
			}
		}
		isValid = true;
		return true; //�� ���
	}
	
	public void show() {
		if(isValid) {
			System.out.print("�ζ� ��ȣ : ");
			for(int n : lottoNumber) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		else {
			System.out.println("�߸��� �ζ� ��ȣ �Դϴ�.");
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
