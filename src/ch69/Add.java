package ch69;
//익명 함수와 매개 변수만으로 구현되므로 인터페이스는 단 하나의 메서드만을 선언해야함 
//@FunctionalInterface 애노테이션(annotation)

@FunctionalInterface
public interface Add {
	
	//익명함수 2개이상 선언시 오류
	public int add(int x, int y);

	
}
