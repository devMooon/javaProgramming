package regMember3;

public class Department {
	private String name; //�μ���
	private String number; //�μ� ��ȭ ��ȣ
	private int roomNumber; //�μ� ȣ�� ��ȣ
	
	public Department(String name) {
		this.name = name;
		this.number = null;
		this.roomNumber = -1;
	}
	public Department(String name, String number, int roomNumber) {
		this.name = name;
		this.number = number;
		this.roomNumber = roomNumber;
	}
	public void show() {
		System.out.print(name + " ");
		if(number != null) System.out.print("(" + number + ") ");
		if(roomNumber != -1) System.out.print("(" + roomNumber + ")");
	}
	@Override
	public String toString() {
		return name;
	}
	
}
