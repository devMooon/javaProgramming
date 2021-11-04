package chapter3.ArrayRand;

import java.util.Random;

public class ArrayRand {
	static void showArray(int[] nums) {
		for(int n: nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	static void randomArray(int[] nums) {
		Random r = new Random();
		for(int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(10) + 1;
		}
	}
	/*static void randomArray2(int[] nums) { //��ü ������ for each ������ �� �� ������?
		Random r = new Random();             //�̰� �� �ȵǳ���? �ȵǴ� ���� �����ΰ���?
		for(int n: nums) {
			n = r.nextInt(10) + 1;
		}
	}*/
	
	static double averageArray(int[] nums) {
		int sum = 0;

		for(int n: nums) {
			sum += n;
		}
		
		return sum/nums.length;
	}
	
	public static void main(String[] args) {
		int[] numbers = new int[10]; //���� �迭 10�� ���� 0���� �ʱ�ȭ �Ǿ� ����
		System.out.print("�ʱ�ȭ ���� ������ : ");
		showArray(numbers);
		randomArray(numbers);
		System.out.print("������ ������ : ");
		showArray(numbers);
		System.out.print("����� " + averageArray(numbers));	
	}

}
