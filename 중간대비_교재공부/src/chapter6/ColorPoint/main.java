package chapter6.ColorPoint;

public class main {

	public static void main(String[] args) {
		Color c1 = new Color("blue");
		Color c2 = new Color(2, 3, "red");
		
		System.out.println(c1.show());
		System.out.println(c2.show());
	}

}
