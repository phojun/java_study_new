package ch31.com.singletonPattern;
/*
 * 싱글톤 패턴이란?
 * 프로그램에서 인스턴스가 단 한 개만 생성되어야 하는 경우 사용하는 디자인 패턴
 * static 변수, 메서드를 활용하여 구현
 */
public class Company {//싱글톤 패턴으로 회사 객체 구현
	
	private static Company instance = new Company();//유일한 객체 생성
	
	private Company(){//생성자는 private으로 선언

	}
	//외부에서 접근 가능한 메서드 생성
	public static Company getInstance() {
		if(instance==null) {
			instance = new Company();
		}
		return instance;
	}
}
