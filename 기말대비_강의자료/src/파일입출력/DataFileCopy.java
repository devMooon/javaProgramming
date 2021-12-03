package 파일입출력;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataFileCopy {
	String inputText;
	String outputText;
	
	FileInputStream fis = null;
	BufferedInputStream bis = null;
	DataInputStream dis = null;
	
	FileOutputStream fos = null;
	BufferedOutputStream bos = null;
	DataOutputStream dos = null;
	
	
	public DataFileCopy(String inputText, String outputText) {
		this.inputText = inputText;
		this.outputText = outputText;
		
		copy();
	}
	private void copy() {
		try {
			fis = new FileInputStream(inputText);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(dis);
			
			fos = new FileOutputStream(outputText);
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
			
			byte b[] = new byte[1024];
			dis.read(b);
			dos.write(b);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(dis != null) dis.close();
				if(bis != null) bis.close();
				if(fis != null) fis.close();
				if(dos != null) dos.close();
				if(bos != null) bos.close();
				if(fos != null) fos.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
