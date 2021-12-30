package ch19;

public class BreakTest {
	    
	public static void main(String[] args) {
		int sum = 0;
		
		for(int num=1; ; num++) {
			sum+=num;
			if(sum>=100) {
				break;
			}
			
			System.out.printf("num = %d, sum = %d",num,sum);
			System.out.println();
		}
	}
}
