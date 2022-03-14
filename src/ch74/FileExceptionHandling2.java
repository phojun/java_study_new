package ch74;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling2 {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("a.txt")) {
			// 리소스를 사용하는 경우 close() 하지 않아도 자동으로 해제 되도록 함
			System.out.println("read");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 오류 없이 실행");
	}
}
