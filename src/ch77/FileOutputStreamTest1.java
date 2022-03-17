package ch77;

import java.io.FileOutputStream;

public class FileOutputStreamTest1 {
	
	public static void main(String[] args) {
	
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
