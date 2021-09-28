package 자료구조론test;

public class test {
	public static void test_a(int n)
	{
		System.out.println(n + " ");
		if(n>0)
		test_a(n-2);
	}
	public static void main(String[] args) {
		test_a(4);
	}

}
