package tv;

public class TV {
	private final int MIN_CHANNEL = 1;
	private final int MAX_CHANNEL = 5;
	private final int MIN_VOLUME = 1;
	private final int MAX_VOLUME = 10;
	
	private boolean status = false;
	private int channel = 1;
	private int volume = 5;
	
	public void pushPower(){
		if(status) status = false;
		else status = true;
		
		showStatus();
	}
	
	public void showStatus(){
		if(status) System.out.println("전원 ON");
		else System.out.println("전원 OFF...");
	}
	
	public void channelUp() {
		if(status) {
			if(channel >= MAX_CHANNEL) System.out.println("channel MAX!!");
			else channel++;
			showChannel();
		}
		else showStatus();
	}
	public void channelDown() {
		if(status) {
			if(channel <= MIN_CHANNEL) System.out.println("channel MIN!!");
			else channel--;
			showChannel();
		}
		else showStatus();
	}
	public void volumeUp() {
		if(status) {
			if(volume >= MAX_VOLUME) System.out.println("volume MAX!!");
			else volume++;
			showVolume();
		}
		else showStatus();
	}
	public void volumeDown() {
		if(status) {
			if(volume <= MIN_VOLUME) System.out.println("volume MIN!!");
			else volume--;
			showVolume();
		}
		else showStatus();
	}
	
	public void showVolume() {
		System.out.println("volume:" + volume);
	}
	public void showChannel() {
		System.out.println("channel:" + channel);
	}
	
	public void printTV() {
		if(status) {
			System.out.println();
			System.out.println("*** TV ***");
			showVolume();
			showChannel();
			showStatus();
			System.out.println();
		}
		else showStatus();
	}
	
	
	
}
