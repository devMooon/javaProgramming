package ex.poly;

public class StudentTest1 {

	public static void main(String[] args) {
		//��ĳ����
		Person p = new UnivStudent("ȫ�浿", 20, "��ǻ�Ͱ���");
		p.WhatYourName();
		
		//�ڽĿ��� �߰��� ��� ���� �Ұ�
		//p.WhoAreYou();
	
		//�⺻������ �ٿ� ĳ������ ��Ÿ�� �� ����
		//UnivStudent s_cerr = new Person("������", 18);	
		
		//�߸��� ����� �ٿ� ĳ������ ��Ÿ�� �� ����
		try {
			UnivStudent s_rerr = (UnivStudent) new Person("������", 18);
			s_rerr.WhoAreYou();
		}
		catch(ClassCastException e) {
			e.printStackTrace();
		}
		
		//��ȿ�� �ٿ� ĳ����
		if(p instanceof UnivStudent) {
			((UnivStudent) p).WhoAreYou();
		}
	}

}
