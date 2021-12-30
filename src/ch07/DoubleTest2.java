package ch07;

public class DoubleTest2 {
	public static void main(String[] args) {
		
		double dNum =1.0;
		
		for(int i=0;i<10000;i++) {
			dNum+=0.1;
		}
		System.out.println(dNum);
		//지수와 가수로 나타내는 부동 소수점 방식에서는 지수부가 0을 표현할 수 없기 때문에 약간의 오차가 발생
	}

}
