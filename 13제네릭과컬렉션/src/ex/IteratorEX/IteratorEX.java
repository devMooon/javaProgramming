package ex.IteratorEX;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEX {

	public static void main(String[] args) {
		//ArrayList�÷��� ���� -> ���׸� Ŭ������ ������ �� �� �ڷ����� String���� ������
		ArrayList<String> list = new ArrayList<String>();
		
		//�÷��ǿ� �� �ֱ�
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		
		//�÷����� �ݺ��� ��ü ��ȯ
		Iterator<String> itr = list.iterator();
		System.out.println("���� ��");
		
		//���� ���� ������ true ��ȯ
		while(itr.hasNext()) {
			String current = itr.next(); //���� �� ��ȯ
			System.out.println(current);
			
			//���� ���� "Third"�� ������
			if(current.compareTo("Third") == 0) {
				itr.remove();
			}
		}
		
		itr = list.iterator();
		
		System.out.println("���� ��");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
