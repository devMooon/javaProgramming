//��ǻ�Ͱ������� 20200675 ������


public class Child {
	private int numOfCorrectAnswers = 0;

	public int getNumOfCorrectAnswers() {
		return numOfCorrectAnswers;
	}

	public void setNumOfCorrectAnswers(int numOfCorrectAnswers) {
		this.numOfCorrectAnswers += numOfCorrectAnswers;
	}
	
	public void showInfo(int repeat) {
		System.out.println();
		System.out.println("���䰳��: �� " + repeat + "���� �� *" + getNumOfCorrectAnswers() + "*��");
	}
}
