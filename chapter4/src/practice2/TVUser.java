package practice2;
//덕성여자대학교 컴퓨터공학전공 20200675 문서연
public class TVUser {

	public static void main(String[] args) {
		TV tv1 = new TV();
		
		tv1.pushPower();
		for (int i = 0; i < 6; i++)
		{
			tv1.volumeUp();
			System.out.println("현재 볼륨 : " + tv1.getVolume());
		}
		for (int i = 0; i < 2; i++)
		{
			tv1.volumeDown();
			System.out.println("현재 볼륨 : " + tv1.getVolume());
		}
		
		System.out.println("\n*************\n");
		for (int i = 0; i < 6; i++)
		{
			tv1.channelUp();
			System.out.println("현재 채널 : " + tv1.getChannel());
		}
		for (int i = 0; i < 2; i++)
		{
			tv1.channelDown();
			System.out.println("현재 채널 : " + tv1.getChannel());
		}
		
		System.out.println("\n*************\n");
		tv1.pushPower();
		tv1.volumeDown();
		tv1.channelDown();
	}

}
