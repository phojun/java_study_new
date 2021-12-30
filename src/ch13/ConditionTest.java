package ch13;

import java.util.Scanner;

public class ConditionTest {
	public static void main(String[] args) {
		//조건식 ? 결과1(참일때 실행):결과2(거짓일때 실행)
		int num=(5>3) ? 10:20;
		
		System.out.println(num);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력받은 두 수중 큰 수를 출력하시오");
		System.out.printf("정수 1 : ");
		int i = sc.nextInt();
		System.out.printf("정수 2 : ");
		int z = sc.nextInt();
		
		int max = (i>z)? i:z ;
		
		System.out.printf("%d와 %d 중 %d가 큰 수 입니다.",i,z,max);
		
		sc.close();
	}
}
