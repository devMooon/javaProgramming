//컴퓨터공학전공 20200675 문서연
package child;

public class Child {
	private int numOfCorrectAnswers = 0;

	public int getNumOfCorrectAnswers() {
		return numOfCorrectAnswers;
	}

	public void setNumOfCorrectAnswers(int numOfCorrectAnswers) {
		this.numOfCorrectAnswers = numOfCorrectAnswers;
	}
	
	public void showInfo(int repeat) {
		System.out.println();
		System.out.println("정답개수: 총 " + repeat + "문제 중 *" + numOfCorrectAnswers + "*개");
	}
}
