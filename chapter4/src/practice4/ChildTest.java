package practice4;
//컴퓨터공학전공 20200675 문서연
public class ChildTest {

	public static void main(String[] args) {
		Child moon = new Child("moon");
		Child kim = new Child("kim");
		
		Child.marbles_game(moon, kim, 2);
		moon.showInfo();
		kim.showInfo();
		
		Child.marbles_game(kim, moon, 7);
		moon.showInfo();
		kim.showInfo();
		
		Child.marbles_game(kim, moon, 12);
		moon.showInfo();
		kim.showInfo();
	}

}
