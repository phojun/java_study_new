package ch08;

public class CharacterTest {

	public static void main(String[] args) {
		char ch1='A';
		System.out.println(ch1);
		System.out.println((int)ch1);//아스키값으로 출력됨
		
		char ch2 =66;//아스키값으로 인식한다
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println((char)ch3);
		
		//char ch4 =-67;(error)//음수값은 char값으로 넣을 수 없다.
		
		char han='한';
		char ch = '\uD55c';
		
		System.out.println(han);
		System.out.println(ch);
	}

}
