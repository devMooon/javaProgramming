package tv;

public class TVUser {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.pushPower();
		tv.printTV();
		
		for (int i = 0; i < 6; i++) {
			tv.volumeUp();
		}
		for (int i = 0; i < 10; i++) {
			tv.volumeDown();
		}
		
		for (int i = 0; i < 6; i++) {
			tv.channelUp();
		}
		for (int i = 0; i < 6; i++) {
			tv.channelDown();
		}
		
		tv.pushPower();
		tv.printTV();
		
	}
}
