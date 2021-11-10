package 텔레비전;

public class TV {
	private final int CMAX = 5;
	private final int CMIN = 1;
	private final int VMAX = 10;
	private final int VMIN = 1;
	
	private boolean status;
	private int channel;
	private int volume;
	
	public TV() {
		this.status = false;
		this.volume = 5;
		this.channel = 1;
	}
	
	void pushPower(){
		System.out.print("TV ");
		if(status) {
			status = false;
			System.out.println("OFF");
		}
		else {
			status = true;
			System.out.println("ON");
		}
	}
	
	void channelUp(){
		if(status) {
			if (channel >= CMAX) {
				channel = CMIN - 1;
			}
			channel++;
			System.out.println("channel :" + channel);
		} else System.out.println("TV를 켜세요");
	}
	void channelDown(){
		if(status) {
			if (channel <= CMIN) {
				channel = CMAX + 1;
			}
			channel--;
			System.out.println("channel :" + channel);
		}else System.out.println("TV를 켜세요");
	}
	void volumeUp(){
		if(status) {
			if (volume >= VMAX) {
				System.out.println("MAX");
			}
			else {
				volume++;
				System.out.println("volume :" + volume);
			}
		}else System.out.println("TV를 켜세요");
	}
	void volumeDown(){
		if(status) {
			if (volume <= VMIN) {
				System.out.println("MIN");
			}
			else {
				volume--;
				System.out.println("volume :" + volume);
			}
		}else System.out.println("TV를 켜세요");
	}
}
