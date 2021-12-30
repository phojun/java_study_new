package ch09;

public class LocalVariableType {
	public static void main(String[] args) {
		
		//변수 자료형 없이 변수사용(지역변수만 사용가능 java10이상 부터 지원됨)
		var i=10;
		var j = 10.0;
		var str = "hello";
		var isTrue =true;
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		System.out.println(isTrue);
	}

}
