package ch76;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamTest2 {
	
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input.txt")){
			int i;
			InputStreamReader isr = new InputStreamReader(fis);
			
			while((i=isr.read()) !=  -1) {
				System.out.print((char)i);
			}
		}catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("오류 검출되었지만 강제종료 되지 않음");
		

	}
}
