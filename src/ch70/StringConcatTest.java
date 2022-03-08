package ch70;

public class StringConcatTest {
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World!!!!!!";
		
		//기본 표현
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString("Hello", "World!!");
		
		//람다식 표현 ---> StringConcatImpl를 생략할 수 있음(BUT ! 인터페이스에 메서드를 하나밖에 만들 수 없다는 단점이 있음)
		StringConcat concat = (s,v)-> System.out.println(s+", "+v);
		concat.makeString(s1, s2);
		
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				  System.out.println(s1+"....... "+s2);
				
			}
		};
		
		concat2.makeString(s1, s2);
	}

}
