package chapter6.pakage.main;

import chapter6.pakage.etc.Calc;

public class MainApp {

	public static void main(String[] args) {
		Calc c = new Calc(10, 20);
		System.out.println(c.sum());

	}

}
