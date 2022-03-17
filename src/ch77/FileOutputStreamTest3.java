package ch77;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamTest3 {
	
	public static void main(String[] args) throws FileNotFoundException {
	
		FileOutputStream fos = new FileOutputStream("output3.txt");
		try(fos){
			byte[] bs = new byte[26];
			
			byte data = 65;
			for(int i = 0; i<bs.length; i++) {
				bs[i] = data++;
			}
			fos.write(bs,2,10); // 배열의 2 번째 위치부터 10 개 바이트
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
		
		//출력 버퍼를 비울때 flush() 메서드를 사용(여기선 굳이 안씀)
	}

}
