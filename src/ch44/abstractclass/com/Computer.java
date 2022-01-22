package ch44.abstractclass.com;
//추상 class
// 구현 코드 없이 메서드의 선언만 있는 추상 메서드(abstract method)를 포함한 클래스
//추상클래스는 인스턴스화 할 수 없음(new로 생성자를 만들 수 없음)
//용도 - 상속을 하기위해서만 만들어짐
public abstract class Computer {
	
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

}
