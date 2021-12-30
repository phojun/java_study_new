package ch19;

public class ContinueTest {
	public static void main(String[] args) {
		for(int i=1; i<=100;i++) {
			if((i%3)!=0) {
				continue;//반환 값이 true 일때 후행의 수행문을 수행하지 않음
			}
			System.out.print(i+", ");
			if(((i/3)%4)==0) {
				System.out.println();
			}
			
		}
	}

}
