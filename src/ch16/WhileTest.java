package ch16;

public class WhileTest {//조건 체크 후 실행

	public static void main(String[] args) {
		int num=1;
		int sum=0;
		while(num <=10) {
			System.out.println(num);
			sum+=num;
			num++;
		}
		System.out.println(sum);
	}

}
