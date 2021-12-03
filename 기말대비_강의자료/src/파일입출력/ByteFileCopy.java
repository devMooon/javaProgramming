package 파일입출력;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileCopy {
	String srcFileName;
	String destFileName;
	
	public ByteFileCopy(String srcFileName, String destFileName){
		this.srcFileName = srcFileName;
		this.destFileName = destFileName;
		
		copy();
	}
	
	void copy() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(srcFileName);
			fos = new FileOutputStream(destFileName);
			
			/*int byteData;
			while(true) {
				byteData = fis.read();
				if(byteData == -1) break;
				
				fos.write(byteData);
			}*/
			byte b[] = new byte[1024];
			fis.read(b);
			fos.write(b);
			
		} catch (FileNotFoundException e) {
			System.out.print(e.getMessage());
			System.err.println("복사를 취소합니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
