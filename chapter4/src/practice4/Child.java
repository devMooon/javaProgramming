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
			System.out.print("'" + name + "' 어린이의 구슬 개수를 입력 하세요. : ");
			num = s.nextInt();
			
			if (num <= 0) {
				System.out.println("구슬 개수는 0이상.");
				continue;
			}
			else {
				break;
			}
		}
		numOfMarble = num;
	}
	
	static void start_messege() {
		System.out.println("==========게임을 시작합니다.==========");
	}
	
	public int getNumOfMarble() {
		return numOfMarble;
	}

	public int loserSetNumOfMarble(int numOfMarble) {
		if (this.numOfMarble - numOfMarble < 0) {
			System.out.println("구슬의 개수를 0개 미만로 만들 수 없으므로 가진 구슬 " + this.numOfMarble + "개만 모두 가져옵니다..");
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
		System.out.println("배팅 구슬 개수 : " + marble);
		int lostMarble = loser.loserSetNumOfMarble(marble);
		winner.winnerSetNumOfMarble(lostMarble);
	}
	
	void showInfo() {
		System.out.println("'" + name + "' 어린이의 구슬개수 : " + numOfMarble);
	}
}
