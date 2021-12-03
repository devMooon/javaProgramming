package 파일입출력;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFileEX {
	private String route;
	private FileReader fr = null;
	private BufferedReader br = null;
	private FileWriter fw = null;
	private BufferedWriter bw = null;
	
	public BufferedFileEX(String route) {
		this.route = route;
		
		write();
		read();
	}
	private void write() {
		try {
			fw = new FileWriter(route);
			bw = new BufferedWriter(fw);
			
			bw.write("Test 중입니다.");
			bw.newLine();
			bw.write("안녕하세요." + System.getProperty("line.separator"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
				try {
					if(bw != null) bw.close();
					if(fw != null) fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	private void read() {
		try {
			fr = new FileReader(route);
			br = new BufferedReader(fr);
			
			String msg;
			while((msg = br.readLine()) != null){
				System.out.println(msg);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
