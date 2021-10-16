package beadGame;

public class Child {
	final int MIN_BEAD = 0;
	private int beadNum;
	
	public Child() {
		this(0);
	}
	public Child(int beadNum) {
		if(beadNum < MIN_BEAD) {
			System.out.println("구슬은 " + MIN_BEAD + "개 이상이어야 합니다.");
			System.out.println("*0개로 초기화..*");
			beadNum = 0;
		}
		this.setBeadNum(beadNum);
	}
	
	final public int getBeadNum() {
		return beadNum;
	}
	public void setBeadNum(int beadNum) {
		this.beadNum = beadNum;
	}
	public void addBead(int beadNum) {
		this.beadNum += beadNum;
	}
	public void loseBead(int beadNum) {
		this.beadNum -= beadNum;
	}
	public boolean isvalid(int beadNum) {
		if(getBeadNum() - beadNum < MIN_BEAD) {
			System.out.println("상대방의 구슬을 " + MIN_BEAD + "개보다 작게로 만들 수 없기 때문에 " + getBeadNum() + "개만 뺏어옵니다!");
			return false;
		}
		else return true;
	}
	public void gameWin(Child loser, int beadNum) {
		if(!loser.isvalid(beadNum)) beadNum = loser.getBeadNum();
		loser.loseBead(beadNum);
		addBead(beadNum);
	}
	public void gameLose(Child winner, int beadNum) {
		winner.gameWin(this, beadNum);
	}	
}
