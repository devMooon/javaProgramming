package 배열연습.기본자료형_2차원_가변적길이_함수;

import java.util.Random;

public class test {
	public static int[][] set()
	{
		Random r = new Random();
		int [][] numbers = new int[5][];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = new int[r.nextInt(10) + 1];
			
			for(int k = 0; k < numbers[i].length; k++) {
				numbers[i][k] = r.nextInt(10);
			}
		}
		return numbers;
	}
	
	public static void show(int[][] numbers)
	{
		for(int[] nums : numbers) {
			for(int n : nums) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] nums = set();
		show(nums);
	}

}
