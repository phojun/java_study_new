package ch21;

public class FunctionTest {
	
	public static int addNum(int num1, int num2) {//함수는 이름, 매개 변수, 반환 값, 함수 몸체(body)로 구성되며, 클래스 선언과 달리 첫글자는 소문자로 시작되다
		int result;
		result = num1+num2;
		return result;
	}
	public static void sayHello(String greeting) {//void는 반환값이 없을때 쓴다.
		System.out.println(greeting);
	}

	public static int calcSum() {
		int sum=0;
		int i;
		for(i=0; i<=100;i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n1=10;
		int n2=20;
		
		int total = addNum(n1,n2);
		
		sayHello("하이");
		
		int num=calcSum();
		
		System.out.println(total);
		System.out.println(num);
		
	}
}

//스택메모리 = 함수가 호출될 때 지역 변수들이 사용하는 메모리(수행이 끝나면 자동으로 반환)