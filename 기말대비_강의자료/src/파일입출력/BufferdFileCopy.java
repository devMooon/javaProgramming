package 파일입출력;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferdFileCopy {
	String srcFileName;
	String destFileName;
	
	public BufferdFileCopy(String srcFileName, String destFileName){
		this.srcFileName = srcFileName;
		this.destFileName = destFileName;
		
		copy();
	}
	
	void copy() {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(srcFileName);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(destFileName);
			bos = new BufferedOutputStream(fos);
			
			int byteData;
			while(true) {
				byteData = bis.read();
				if(byteData == -1) break;
				
				bos.write(byteData);
			}
			/*byte b[] = new byte[1024];
			fis.read(b);
			fos.write(b);*/
			
		} catch (FileNotFoundException e) {
			System.out.print(e.getMessage());
			System.err.println("복사를 취소합니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(bis != null) bis.close();
				if(fis != null) fis.close();
				if(bos != null) fis.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
