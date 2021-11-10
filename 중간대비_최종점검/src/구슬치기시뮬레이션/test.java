package 구슬치기시뮬레이션;

public class test {

	public static void main(String[] args) {
		Child c1 = new Child(15);
		Child c2 = new Child(9);
		
		c1.show();
		c2.show();
		
		c1.game(c2, 2);
		c2.game(c1, 7);
		c2.game(c1, 15);
		
	}

}
