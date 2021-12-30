package ch13;

public class BitTest {
	public static void main(String[] args) {
		//비트 연산차
		int num1 = 5;//00000101
		int num2 = 10;//00001010
		
		//~연산자 : 비트의 반전
		System.out.println(~num1);//11111010=>-6
		//|연산자 : 비트의 OR 두 값이 0일때만 0반환 나머지는 1반환
		System.out.println(num1|num2);//00000101|00001010=>00001111=>15;
		//&연산자 : 비트의 AND 두 값 모두 1일때 1반환 0이 있으면 0반환 
		System.out.println(num1&num2);//00000101&00001010=>00000000=>0;
		//^연산자 : 비트의 XOR 두 값이 다를 경우 1반환 같을경우 0 반환
		System.out.println(num1 ^ num2);//00000101^00001010=>00001111=>15;
		//<<연산자 : 왼쪽 shift 변수를 왼쪽으로 이동
		System.out.println(num1 << 2);//00000101<< =>00010100=>20;
		//>>연산자 : 오른쪽 shift 변수를 오른쪽으로 이동
		System.out.println(num1 >> 2);//00000101>> => 00000001=1;
		System.out.println(num1);//변수의 변동없음
		System.out.println(num1<<=2);//변수의 값이 변함 00010100=20;(대입연산이 포함됬기 때문)
		System.out.println(num1);
	}
}
