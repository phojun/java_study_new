package ch79;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamTest {
	
	public static void main(String[] args) {
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"))){
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"))){
			
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}

}
