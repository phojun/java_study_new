package ch78;

import java.io.FileReader;

public class FileReaderTest {
	
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("reader.txt")){
			
			int i;
			while((i=fr.read()) != -1) {
				System.out.print((char)i);
			}
			System.out.println();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
