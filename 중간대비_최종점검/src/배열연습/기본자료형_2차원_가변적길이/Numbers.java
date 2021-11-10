package 배열연습.기본자료형_2차원_가변적길이;

import java.util.Random;

public class Numbers {
	Random r = new Random();
	
	private int [][] numbers;
	
	public Numbers(int size)
	{
		numbers = new int[size][];
	}
	public void set()
	{
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = new int[r.nextInt(10) + 1];
			
			for(int k = 0; k < numbers[i].length; k++) {
				numbers[i][k] = r.nextInt(10) + 1;
			}
		}
	}
	public void show()
	{
		for(int[] nums : numbers) {
			for(int n : nums) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
}
