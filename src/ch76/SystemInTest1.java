package ch76;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {

	public static void main(String[] args) {
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");

		int i;// System.in.read() // 한 바이트 읽기
		try {
			while ((i = System.in.read()) != '\n') {
				// System.out.println(i);
				System.out.print((char) i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block1

			e.printStackTrace();
		}
	}

}
