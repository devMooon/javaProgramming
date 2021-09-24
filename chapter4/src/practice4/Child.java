package practice4;

import java.util.Scanner;

public class Child {
	String name;
	private int numOfMarble;
	
	Child (String name){
		this.name = name;
		int num;
		while (true) {
			Scanner s = new Scanner(System.in);
			System.out.print("'" + name + "' ����� ���� ������ �Է� �ϼ���. : ");
			num = s.nextInt();
			
			if (num <= 0) {
				System.out.println("���� ������ 0�̻�.");
				continue;
			}
			else {
				break;
			}
		}
		numOfMarble = num;
	}
	
	static void start_messege() {
		System.out.println("==========������ �����մϴ�.==========");
	}
	
	public int getNumOfMarble() {
		return numOfMarble;
	}

	public int loserSetNumOfMarble(int numOfMarble) {
		if (this.numOfMarble - numOfMarble < 0) {
			System.out.println("������ ������ 0�� �̸��� ���� �� �����Ƿ� ���� ���� " + this.numOfMarble + "���� ��� �����ɴϴ�..");
			numOfMarble = this.numOfMarble;
		}
		this.numOfMarble -= numOfMarble;
		return numOfMarble;
	}
	
	public void winnerSetNumOfMarble(int numOfMarble) {
		this.numOfMarble += numOfMarble;
	}

	static void marbles_game(Child winner, Child loser, int marble) {
		start_messege();
		System.out.println("���� ���� ���� : " + marble);
		int lostMarble = loser.loserSetNumOfMarble(marble);
		winner.winnerSetNumOfMarble(lostMarble);
	}
	
	void showInfo() {
		System.out.println("'" + name + "' ����� �������� : " + numOfMarble);
	}
}
