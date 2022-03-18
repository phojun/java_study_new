package ch79;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class BufferedStreamTest {//FileCopyTest에서 했던것 보다 시간이 단축됨 (23279 소요 -> 149 소요)
	
	public static void main(String[] args) {
		
		long millisecond=0;
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy2.zip"))){
			
			millisecond = System.currentTimeMillis();
			int i;
			
			while((i=bis.read()) != -1) {
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(millisecond + " 소요되었습니다.");
		
		/*
		 * Socket socket = new Socket(); BufferedReader br = new BufferedReader(new
		 * InputStreamReader(socket.getInputStream()));
		 * 
		 * br.readLine();
		 */
		
		
	}

}
