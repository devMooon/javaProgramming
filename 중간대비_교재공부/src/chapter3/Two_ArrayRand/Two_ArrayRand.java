package chapter3.Two_ArrayRand;

import java.util.Random;

public class Two_ArrayRand {

	public static void main(String[] args) {
		int[][] numbers = new int[3][];
		numbers[0] = new int[4];
		numbers[1] = new int[7];
		numbers[2] = new int[5];
		
		Random r = new Random();
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print((i+1)+"¹ø ¹è¿­ : ");
			for(int k = 0; k < numbers[i].length; k++) {
				numbers[i][k] = r.nextInt(100)+1;
				System.out.print(numbers[i][k] + " ");
			}
			System.out.println();
		}
	}

}
