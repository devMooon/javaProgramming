package ���������;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamEX {

	public static void main(String[] args) {
		File file = new File("c:\\Temp\\test.out");
		byte b[] = {5, 0, 4, 0, 1, 1, 4, 2};
		
		try {
			FileOutputStream outStream = new FileOutputStream(file, false);
			outStream.write(b);
			
			outStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("���� ��� ����: " + file.getAbsoluteFile());
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println(file.getAbsoluteFile() + "�� ������ �� �����ϴ�! ���ϸ��� Ȯ�� ���ּ���.");
			e.printStackTrace();
		}
		System.out.println(file.getAbsoluteFile() + "�� ������ ���� �߽��ϴ�.");
	}

}
