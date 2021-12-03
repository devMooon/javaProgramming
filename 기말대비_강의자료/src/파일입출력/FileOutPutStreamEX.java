package 파일입출력;

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
			System.err.println("파일 경로 오류: " + file.getAbsoluteFile());
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println(file.getAbsoluteFile() + "에 저장할 수 없습니다! 파일명을 확인 해주세요.");
			e.printStackTrace();
		}
		System.out.println(file.getAbsoluteFile() + "에 파일을 저장 했습니다.");
	}

}
