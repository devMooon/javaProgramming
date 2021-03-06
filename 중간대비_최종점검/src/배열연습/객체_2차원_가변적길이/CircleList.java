package 배열연습.객체_2차원_가변적길이;

import java.util.Random;

import 배열연습.객체_2차원_고정적길이.Circle;

public class CircleList {
	Random r = new Random();
	Circle[][] circleList;
	
	public CircleList(int size1){
		circleList = new Circle[size1][]; //참조변수 배열 생성 -> 객체 생성!
		for(int i = 0; i < circleList.length; i++) {
			circleList[i] = new Circle[r.nextInt(10)]; //참조변수 배열 생성 -> 객체 생성!
			
			for(int k = 0; k < circleList[i].length; k++) {
				circleList[i][k] = new Circle(r.nextInt(10));
			}
		}
	}
	public void show(){
		for(Circle[] circles : circleList) {
			System.out.print("반지름 : ");
			for(Circle c : circles) {
				System.out.print(c.getRadius() + " ");
			}
			System.out.println();
		}
	}
}
