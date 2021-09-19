package practice2;
//덕성여자대학교 컴퓨터공학전공 20200675 문서연
public class TV {
	final int CHANNEL_MIN = 1;
	final int CHANNEL_MAX = 5;
	final int VOLUME_MIN = 1;
	final int VOLUME_MAX = 10;
	
	boolean status = false;
	int channel = 1;
	int volume = 5;
	
	public boolean checkPower() {
		if (this.status == false) {
			System.out.println("TV is not turned on.");
			return false;
		}
		return true;
	}
	
	public void pushPower() {
		if (this.status == true) {
			this.status = false;
			System.out.println("TV OFF");
		}
		else {
			this.status = true;
			System.out.println("TV ON");
		}
	}
	
	public int getChannel() {
		return this.channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return this.volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void channelUp() {
		if (checkPower() == true) {
			if (this.channel >= CHANNEL_MAX)
				System.out.println("channel MAX...");
			else
				this.channel++;
		}
	}
	
	public void channelDown() {
		if (checkPower() == true) {
			if (this.channel <= CHANNEL_MIN) {
				System.out.println("channel MIN...");
			}
			else
				this.channel--;
		}
	}
	
	public void volumeUp() {
		if (checkPower() == true) {
			if (this.volume >= VOLUME_MAX) {
				System.out.println("volume MAX...");
				this.volume = VOLUME_MAX;
			}
			else
				this.volume++;
		}
	}
	public void volumeDown() {
		if (checkPower() == true) {
			if (this.volume <= VOLUME_MIN) {
				System.out.println("volume MIN...");
			}
			else
				this.volume--;
		}
	}
}
