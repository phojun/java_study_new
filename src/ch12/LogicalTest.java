package ch12;

public class LogicalTest {
	public static void main(String[] args) {
		int num1 = 10;
		int i =2;
		boolean value= ((num1=num1+10)<10 && (i=i+2)<10);
		
		System.out.println(value);
		System.out.println(num1);//논리곱 연산은 첫항이 거짓일 때 뒷항을 계산하지 않고 false를 반영한다
		System.out.println(i);//i값은 증가하지 않았음 why? 앞의 항이 거짓이라 논리곱연산이 계산을 중지했기 때문
		
		int num2 = 10;
		int z =2;
		boolean value2= ((num2=num2+10)<10 || (z=z+2)<10);
		
		System.out.println(value);
		System.out.println(num1);//논리합 연산은 첫항이 참일 때 뒷항을 계산하지 않고 true를 반영한다
		System.out.println(i);//z값은 증가하지 않았음 why? 앞의 항이 참이라 논리합연산이 계산을 중지했기 때문
	}
}
