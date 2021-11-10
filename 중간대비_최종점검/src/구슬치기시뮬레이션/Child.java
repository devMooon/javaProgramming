package ����ġ��ùķ��̼�;

public class Child {
	private int bead;
	
	Child(){
		this(0);
	}
	Child(int bead){
		if(bead < 0) {
			bead = 0;
			System.out.println("������ ������ ������ �� �� �����Ƿ� 0���� �ʱ�ȭ �մϴ�.");
		}
		
		this.bead = bead;
	}
	
	public int getBead() {
		return bead;
	}
	public void setBead(int bead) {
		this.bead = bead;
	}
	public int isvalid(int bead) {
		if((this.bead - bead) < 0) {
			bead = this.bead;
			System.out.println("������ ������ ������ �� �� �����Ƿ� 0���� �ʱ�ȭ �մϴ�.");
			
		}
		return bead;
	}
	public void show() {
		System.out.println("���� ���� ���� : " + bead);
	}
	
	public void game(Child loser, int gameBead) {
		int num = loser.isvalid(gameBead);
		
		loser.setBead(loser.getBead() - num);
		this.setBead(this.getBead() + num);
		
		System.out.println("*** ���� ��� ***");
		System.out.print("���� : "); this.show();
		System.out.print("���� : "); loser.show();
		System.out.println();
	}
}
