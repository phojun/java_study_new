package ch78;

import java.io.FileWriter;

public class FileWriterTest {
	
	public static void main(String[] args) {
		
		char ch[] = {'B','C','D','E',};
		try(FileWriter fw = new FileWriter("writer.txt")){
			
			fw.write('A');//문자 하나 출력
			fw.write(ch);
			fw.write("안녕? 난 박호준");
			fw.write(ch,2,2);
			fw.write("64");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
