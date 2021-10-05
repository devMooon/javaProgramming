//컴퓨터공학전공 20200675 문서연
package calculator;
import java.util.Random;
import java.util.Scanner;

import child.Child;

public class Calculator {
	Random r = new Random();
	private int a;
	private int b;
	private char operater;
	private int answer;
	
	public void startQuestions(Child c, int repeat){
		int correctAnswers = 0;
		for (int i = 0; i < repeat; i++) {
			setNumAndOper();
			correctAnswers += printQuestion(i);
		}
		c.setNumOfCorrectAnswers(correctAnswers);
		c.showInfo(repeat);
	};
	
	
	void setNumAndOper() {
		a = r.nextInt(9);
		b = r.nextInt(9);
		if (r.nextInt(1) == 0) {
			answer = a + b;
			operater = '+';
		} 
		else {
			answer = a - b;
			operater = '-';
		}
	};

	int printQuestion(int number) {
		int chance = 3;
		while(true) {
			Scanner s = new Scanner(System.in);
			System.out.println("*" + (number + 1) + "번 문제");
			System.out.print(a + " " + operater + " " + b + " = ");
			int user = s.nextInt();
			
			if (user == answer) {
				System.out.println("정답입니다!");
				System.out.println();
				return 1;
			}
			else {
				chance--;
				if (chance == 0) {
					System.out.println("기회 3번을 모두 썼습니다.. 정답은 " + answer + "입니다.");
					System.out.println();
					return 0;
				}
				System.out.println("틀렸습니다.. 남은 기회 " + chance + "번!!");
			}
		}
	}	
}
