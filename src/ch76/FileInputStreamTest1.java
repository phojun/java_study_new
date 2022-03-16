package ch76;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				fis.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch(Exception e2) {
				e2.printStackTrace();
			}
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			System.out.println("아직 안죽었다~");
		}
	}

}
