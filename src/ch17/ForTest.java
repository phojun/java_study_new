package ch17;

public class ForTest {

	public static void main(String[] args) {
		//for과 while 비교 -> for이 더 간단하게 쓰일 수 있음
		int sum=0;
		
		for(int i=0; i<10;i++) {//10번 반복
			sum+=(i+1);
		}
		System.out.println(sum);
		//---------------------------------------------------------------------------------------
		int y=1;
		int total=0;
		
		while(y<=10) {//10번 반복
			total+=y;
			y++;
		}
		System.out.println(total);
	}

}
