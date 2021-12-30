package ch15;

import java.util.Scanner;

public class SwitchCatchTest1 {

	public static void main(String[] args) {
		// java 14 버전 이후 쓰이는 switch 문
		Scanner sc = new Scanner(System.in);
		boolean x = true;

		while (x) {
			System.out.printf("입력값 : ");
			int month = sc.nextInt();
			x = switch (month) {
			case 1, 3, 5, 7, 8, 10, 12 -> {
				System.out.println(month + "월은 31일 입니다.");
				yield true;
			}
			case 2 -> {
				System.out.println(month + "월은 28일 입니다.");
				yield true;
			}
			case 4, 6, 9, 11 -> {
				System.out.println(month + "월은 30일 입니다.");
				yield true;
			}
			default -> {
				System.out.println("종료");
				yield false;
			}
			

			};
		}

		sc.close();
	}
}
