package �迭����.��ü_2����_����������;

import java.util.Random;

import �迭����.��ü_2����_����������.Circle;

public class CircleList {
	Random r = new Random();
	Circle[][] circleList;
	
	public CircleList(int size1){
		circleList = new Circle[size1][]; //�������� �迭 ���� -> ��ü ����!
		for(int i = 0; i < circleList.length; i++) {
			circleList[i] = new Circle[r.nextInt(10)]; //�������� �迭 ���� -> ��ü ����!
			
			for(int k = 0; k < circleList[i].length; k++) {
				circleList[i][k] = new Circle(r.nextInt(10));
			}
		}
	}
	public void show(){
		for(Circle[] circles : circleList) {
			System.out.print("������ : ");
			for(Circle c : circles) {
				System.out.print(c.getRadius() + " ");
			}
			System.out.println();
		}
	}
}
