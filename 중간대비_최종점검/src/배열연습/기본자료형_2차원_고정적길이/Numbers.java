package �迭����.�⺻�ڷ���_2����_����������;

import java.util.Random;

public class Numbers {
	Random r = new Random();
	
	int [][] numbers;
	
	Numbers(int size1, int size2){
		numbers = new int[size1][size2];
	}
	
	void setNumbers() {
		for(int i = 0; i < numbers.length; i++) {
			for(int k = 0; k < numbers[i].length; k++) {
				numbers[i][k] = r.nextInt(100)+1;
			}
		}
	}
	
	void show() {
		for(int [] nums : numbers) {
			for(int n : nums) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
}
