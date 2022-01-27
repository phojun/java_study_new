package ch53.objectclassstringbuilder;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java));
		java= java.concat(android);
		//java객체의 주소가 달라진다 -> 하나가 더 생성되어 그만큼 메모리를 더 차지하게 된다 비효율적임을 알 수 있음
		System.out.println(System.identityHashCode(java));
		
		
		//StringBuilder를 쓰면 메모리 절약 가능
		String javaTest= new String("java");
		StringBuilder buffer = new StringBuilder(javaTest);
		System.out.println(System.identityHashCode(buffer));
		buffer.append("android");
		System.out.println(System.identityHashCode(buffer));
		
		String test=buffer.toString();
		System.out.println(test);
		
		
	}

}
