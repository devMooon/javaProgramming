package practice2;
//�������ڴ��б� ��ǻ�Ͱ������� 20200675 ������
public class TVUser {

	public static void main(String[] args) {
		TV tv1 = new TV();
		
		tv1.pushPower();
		for (int i = 0; i < 6; i++)
		{
			tv1.volumeUp();
			System.out.println("���� ���� : " + tv1.getVolume());
		}
		for (int i = 0; i < 2; i++)
		{
			tv1.volumeDown();
			System.out.println("���� ���� : " + tv1.getVolume());
		}
		
		System.out.println("\n*************\n");
		for (int i = 0; i < 6; i++)
		{
			tv1.channelUp();
			System.out.println("���� ä�� : " + tv1.getChannel());
		}
		for (int i = 0; i < 2; i++)
		{
			tv1.channelDown();
			System.out.println("���� ä�� : " + tv1.getChannel());
		}
		
		System.out.println("\n*************\n");
		tv1.pushPower();
		tv1.volumeDown();
		tv1.channelDown();
	}

}
