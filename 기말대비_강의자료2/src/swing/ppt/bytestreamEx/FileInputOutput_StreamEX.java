package swing.ppt.bytestreamEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput_StreamEX {
	private String inputFileName;
	private String outputFileName;
	
	public FileInputOutput_StreamEX(String inputFileName, String outputFileName) {
		
		this.inputFileName = inputFileName;
		this.outputFileName = outputFileName;
		
		
		fileCopy();
	}
	private void fileCopy() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(inputFileName);
			fos = new FileOutputStream(outputFileName);
			
			int bdata;
			
			while(true) {
				bdata = fis.read();
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("복사를 중지합니다.");
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
}
