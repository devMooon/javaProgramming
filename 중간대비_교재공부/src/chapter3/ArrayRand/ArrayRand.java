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
	/*static void randomArray2(int[] nums) { //객체 생성은 for each 문으로 할 수 없나요?
		Random r = new Random();             //이건 왜 안되나요? 안되는 경우는 언제인가요?
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
		int[] numbers = new int[10]; //정수 배열 10개 생성 0으로 초기화 되어 있음
		System.out.print("초기화 전의 정수들 : ");
		showArray(numbers);
		randomArray(numbers);
		System.out.print("랜덤한 정수들 : ");
		showArray(numbers);
		System.out.print("평균은 " + averageArray(numbers));	
	}

}
