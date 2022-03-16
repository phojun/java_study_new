package ch76;

import java.io.FileInputStream;
import java.io.InputStreamReader;


public class FileInputStreamTest3 {
	
	public static void main(String[] args) {
		int i;
		
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			
			byte[] bs = new byte[10];
			while( (i = fis.read(bs,1,9)) != -1 ) {
				/*
				 * for(int ch : bs) { System.out.print((char)ch); }
				 */
				
				for(int j=0; j<i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : "+i+"바이트 읽음");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}

}
