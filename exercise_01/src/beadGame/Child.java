package beadGame;

public class Child {
	final int MIN_BEAD = 0;
	private int beadNum;
	
	public Child() {
		this(0);
	}
	public Child(int beadNum) {
		if(beadNum < MIN_BEAD) {
			System.out.println("������ " + MIN_BEAD + "�� �̻��̾�� �մϴ�.");
			System.out.println("*0���� �ʱ�ȭ..*");
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
			System.out.println("������ ������ " + MIN_BEAD + "������ �۰Է� ���� �� ���� ������ " + getBeadNum() + "���� ����ɴϴ�!");
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
