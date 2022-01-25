package ch49;

public interface Calc {

	double PI = 3.14;
	int ERROR=-9999999;
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2); 
	
	default void description() {//디폴트 메서드 - 인터페이스 클래스에서 구현을 가지는 메서드
		System.out.println("정수의 사칙연산을 제공합니다.");
		myMethod();
	}
	
	static int total(int[] arr) {//정적 메서드 - 인스턴스 생성과 상관 없이 인터페이스 타입으로 사용할 수 있는 메서드
		int total=0;
		for(int num : arr) {
			total+=num;
			
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {//인터페이스 내부에서만 사용하기 위해 구현하는 메서드
		System.out.println("myMethod");
	}
	
	private static void myStaticMethod() {//인터페이스 내부에서만 사용하기 위해 구현하는 메서드
		System.out.println("myStaticMethod");
	}
	
	

}
