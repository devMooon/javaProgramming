package �迭����.�⺻�ڷ���_1����_�Լ�;

import java.util.Random;

public class main {
	public static void setNumbers(int [] nums)
	{
		Random r = new Random();
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(10)+1;
		}
	}
	public static void show(int [] nums)
	{
		for(int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int [] numbers = new int[10];
		setNumbers(numbers);
		show(numbers);
	}

}
