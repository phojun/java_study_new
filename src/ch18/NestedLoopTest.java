package ch18;

public class NestedLoopTest {//중첩 반복문 활용(구구단)

	public static void main(String[] args) {
		
		int total=0;
		for(int dan = 2; dan<10; dan++) {
			System.out.println(dan + "단 ");
			for(int i=1; i<10; i++) {
				total=dan*i;
				System.out.println(dan + " X " + i + " = " + total);
			}
			System.out.println();
		}
		int x =2;
		
		int gugudan=0;
		while( x<=9) {
			System.out.println(x+"단");
			int y=1;
			while(y<10) {
				gugudan=x*y;
				System.out.printf("%d X %d = %d", x,y,gugudan);
				System.out.println();
				y++;
			}
			x++;
			System.out.println();
		}
	}
}
