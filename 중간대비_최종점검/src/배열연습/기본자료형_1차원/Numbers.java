package �迭����.�⺻�ڷ���_1����;

import java.util.Random;
import java.util.Scanner;

public class Numbers {
	Random r = new Random();
	
	private int[] nums1; //�⺻�ڷ����� 1���� �迭
	
	public Numbers() {
		this(0);
	}
	public Numbers(int size) {
		nums1 = new int[size];
	}
	public void setNumber(){
		for(int i = 0; i < nums1.length; i++) {
			nums1[i] = r.nextInt(10)+1;
		}
	}
	public void showNumber() {
		for(int n : nums1) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
