package ch15;

import java.util.Scanner;

public class SwitchCastTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int day;
		boolean x=true;
		while(x) {
			System.out.println("종료하시려면 0을 입력해주세요");
			System.out.println("비교할 월 : ");
			int month=sc.nextInt();
			
			switch(month){
			
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
			case 4: case 6: case 9: case 11:
				day = 30;
				break;
			case 2: 
				day = 28;
				break;
			case 0: 
				day=0;
				x=false;
				System.out.println("종료됩니다.");
				break;
			default:
				day = 0;
				System.out.println("존재하지 않는 달 입니다.");
			
			}
			if(day!=0) {
				System.out.println(month + "월은 " + day + "일입니다.");
			}
			
		}
		sc.close();
	}

}
