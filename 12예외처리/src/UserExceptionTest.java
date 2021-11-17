
public class UserExceptionTest {

	public static void test1(String[] n) throws UserException {
		System.out.println("Test1");
		if(n.length < 1) 
			throw new UserException("아무 것도 없다네");
		else
			throw new UserException("최종 예선", 703);
	}
	public static void main(String[] args) {
		try {
			test1(args);
		}
		catch(UserException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("끝");
		}

	}

}
