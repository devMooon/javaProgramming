
public class ExceptionEx2_withEH2 {

	public static int divide(int n1, int n2) throws ArithmeticException {
		int result = n1 / n2;
		return result;
	}
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 0;
		
		try {
			int result = divide(n1, n2);
			System.out.println(n1 + "/" + n2 + "=" + result);
		}
		catch(ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("³¡\n");
		
	}

}
