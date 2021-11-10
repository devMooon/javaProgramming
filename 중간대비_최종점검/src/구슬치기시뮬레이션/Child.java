package 구슬치기시뮬레이션;

public class Child {
	private int bead;
	
	Child(){
		this(0);
	}
	Child(int bead){
		if(bead < 0) {
			bead = 0;
			System.out.println("구슬의 개수는 음수가 될 수 없으므로 0개로 초기화 합니다.");
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
			System.out.println("구슬의 개수는 음수가 될 수 없으므로 0개로 초기화 합니다.");
			
		}
		return bead;
	}
	public void show() {
		System.out.println("현재 구슬 개수 : " + bead);
	}
	
	public void game(Child loser, int gameBead) {
		int num = loser.isvalid(gameBead);
		
		loser.setBead(loser.getBead() - num);
		this.setBead(this.getBead() + num);
		
		System.out.println("*** 게임 결과 ***");
		System.out.print("승자 : "); this.show();
		System.out.print("패자 : "); loser.show();
		System.out.println();
	}
}
