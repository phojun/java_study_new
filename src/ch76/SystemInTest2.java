package ch76;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {
// InputStream = 바이트 단위 입력 스트림 최상위 추상 클래스
	public static void main(String[] args) {
		System.out.println("알파벳 여러개를 쓰고 [Enter]를 누르세요");
		InputStreamReader isr = new InputStreamReader(System.in);
		int i;
		try {
			while ((i = isr.read()) !=  '\n') {
				// System.out.println(i);
				System.out.print((char) i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block1

			e.printStackTrace();
		}
	}

}
