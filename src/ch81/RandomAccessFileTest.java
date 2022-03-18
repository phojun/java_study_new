package ch81;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
//입출력 클래스 중 유일하게 파일에 대한 입력과 출력을 동시에 할 수 있는 클래스
	
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");
		raf.writeInt(100);
		System.out.println("파일 포인터 위치:" + raf.getFilePointer());
		raf.writeDouble(3.14);
		System.out.println("파일 포인터 위치:" + raf.getFilePointer());
		raf.writeUTF("안녕하세요");
		System.out.println("파일 포인터 위치:" + raf.getFilePointer());
	
		raf.seek(0);//파일 내용을 읽기 전에 포인터를 맨 앞에 가져다 놔야함 안그럼 못찾아서 오류남
		System.out.println("파일 포인터 위치:" + raf.getFilePointer());
		
		int i = raf.readInt();
		double d = raf.readDouble();
		String str = raf.readUTF();
	
		System.out.println("파일 포인터 위치:" + raf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}

}
