package ch16;

import java.util.Scanner;

public class DowhileTest {//조건 상관 없이 1회 수행 후 조건 체크

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;
		int sum=0;
		
		do {
			System.out.printf("정수값 입력 : ");
			input=sc.nextInt();
			sum +=input;
			System.out.println("입력값 총 합 : "+sum);

		}while(input!=0);
		System.out.println("최종값 : "+ sum);
		sc.close();
	}

}
