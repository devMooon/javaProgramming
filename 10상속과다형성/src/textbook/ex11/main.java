package textbook.ex11;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a; int b; String oper;
		
		for(int i = 0; i < 6; i++) {
			System.out.print("두 정수와 연산자를 입력하시오.>> ");
			a = s.nextInt();
			b = s.nextInt();
			oper = s.next();
			
			Calc c = null;
			
			try {
				
				if(oper.equalsIgnoreCase("+")) c = new Add(a, b);
				else if(oper.equalsIgnoreCase("-")) c = new Sub(a, b); 
				else if(oper.equalsIgnoreCase("*")) c = new Mul(a, b); 
				else if(oper.equalsIgnoreCase("/")) c = new Div(a, b);
				
				System.out.println(c.calculate());
			}
			catch(NullPointerException e) {
				System.err.println("NullPointerException");
				break;
			}
			catch(Exception e) {
				System.err.println("Exception");
				break;
			}
			
		}
		
		

	}

}
