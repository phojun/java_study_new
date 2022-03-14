package ch74;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("a.txt");
			System.out.println("read");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			//return;
		} finally {
			if (fis != null) {
				try {
					fis.close();
					System.out.println("fis closed");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("finally");
		}

		System.out.println("end");
	}

}
