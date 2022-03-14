package ch74;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {//예외처리 미루기
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		
		return c;
	}

	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		
		try {
			test.loadClass("a.txt", "abc");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch(Exception e) {//Default exception 정의
			//defualt 처리를 할 때 Exception 블록은 맨 마지막에 위치해야 함
			System.out.println(e);
		}
		System.out.println("정상작동중");

	}

}
