package 파일입출력;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamEX {
	public ObjectStreamEX() {
		save();
		load();
	}
	private void save() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("circlr.dat");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(new Point(3, 4));
			oos.writeObject(new Point(5, 3));
			oos.writeObject(new String("안녕하세요."));
			oos.writeObject(new String("제 이름은 문서연입니다."));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				
				if(oos != null) oos.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private void  load() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("circlr.dat");
			ois = new ObjectInputStream(fis);
			
			Point p1 = (Point)ois.readObject();
			Point p2 = (Point)ois.readObject();
			String s1 = (String)ois.readObject();
			String s2 = (String)ois.readObject();
			
			System.out.println(s1);
			System.out.println(s2);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(ois != null) ois.close();
				if(fis != null) fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
