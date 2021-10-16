package beadGame;

public class Test {
	public static void show(Child c1, Child c2) {
		System.out.println("*** 구슬 현황 ***");
		System.out.println("어린이1 : " + c1.getBeadNum());
		System.out.println("어린이2 : " + c2.getBeadNum());
		System.out.println("");
	}
	public static void main(String[] args) {
		Child c1 = new Child(15);
		Child c2 = new Child(9);
		
		c1.gameWin(c2, 2);
		show(c1, c2);
		c1.gameLose(c2, 7);
		show(c1, c2);
		c1.gameLose(c2, 15);
		show(c1, c2);
	}

}
