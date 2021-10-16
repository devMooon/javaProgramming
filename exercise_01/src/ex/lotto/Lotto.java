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
	//��ȿ ��ȣ�� �ڵ� ����
	public void generate() {
		for (int i = 0; i < lottoNumber.length; i++) {
			lottoNumber[i] = r.nextInt(45) + 1;
			if(!verify(i)) i--;
		}
		isValid = true;
	}

	public void setNum() {
		System.out.println("�ζ� ��ȣ ���� �Է��ϼ���. (1~45�߿� �ߺ� ���� �ۼ�)");
		for (int i = 0; i < 6; i++) {
			System.out.print(i + 1 + "�� �� : ");
			lottoNumber[i] = s.nextInt();
			if(!verify(i) || (lottoNumber[i] < 1 || lottoNumber[i] > 45)) {
				System.out.println("�� �Է� ����!");
				i--;
				continue;
			}
		}
		isValid = true;
	}
			
	//��ȣ ���(����/�ߺ�����) ��ȿ�� ��ȣ�� ������ ��쿡�� ���, �׷��� ������ ���� �޽��� ���
	public void show() {
		if (isValid) System.out.println("������ �ζ� ��ȣ");
		else System.out.println("��ȿ���� ���� ������ ���� �ֽ��ϴ�.");

		for (int n : lottoNumber) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	//�ζ� ��ȣ�� ��ȯ, ������ ��ȣ�� ��ȿ���� ���� ��� null��ȯ
	public int[] getNumbers() {
		if (isValid) {
			return lottoNumber;
		}
		else {
			System.out.print("��ȿ���� ���� ������ ���� �ֽ��ϴ�.");
			return null;
		}
	}

}
