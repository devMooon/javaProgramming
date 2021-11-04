package chapter3.Array;

public class ArrayTest {

	public static void main(String[] args) {
		int [][] numbers = new int[3][];
		
		numbers[0] = new int[5];
		numbers[1] = new int[] {1, 2, 3};
		numbers[2] = new int[10];
		
		for(int[] number : numbers) {
			for(int num: number) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

}
