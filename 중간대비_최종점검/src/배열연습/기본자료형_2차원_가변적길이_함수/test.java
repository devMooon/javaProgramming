package �迭����.�⺻�ڷ���_2����_����������_�Լ�;

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
