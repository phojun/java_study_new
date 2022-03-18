package ch79;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {

		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			int i;
			while((i=isr.read()) != -1) {
				System.out.print((char)i);
			}
			System.out.println();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
