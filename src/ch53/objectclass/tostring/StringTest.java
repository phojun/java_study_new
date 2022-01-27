package ch53.objectclass.tostring;

public class StringTest {
	
	public static void main(String[] args) {
		//한번 생성된 String은 불변(immutable)
		
		
		String str1= new String("aaa");//heap으로 생성시 다른 주소를 가짐
		String str2= new String("aaa");
		
		System.out.println(str1==str2);//주소값을 비교
		System.out.println(str1.equals(str2));//내용값을 비교
		
		String str3 = "aaa";//상수 풀(constant pool)에 있는 주소를 참조하여 생성시 같은 주소를 가짐
		String str4 = "aaa";
		
		System.out.println(str3==str4);
		//메모리 절약의 장점을 가짐
	}

}
