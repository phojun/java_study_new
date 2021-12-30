package ch06;

public class VariableTest {

	public static void main(String[] args) {
		byte bNum = 127;
		
		System.out.println(bNum);
		
		//int num = 12345678900;할당크기 초과오류
		long lNum = 12345678900L;
		
		System.out.println(lNum);
	}

}
