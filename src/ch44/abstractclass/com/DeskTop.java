package ch44.abstractclass.com;

public class DeskTop extends Computer{//상속한 클래스에서 구현된 abstract메서드를 반드시 구현해 줘야 오류없음

	
	///추상 클래스의 추상 메서드는 하위 클래스가 상속 하여 구현(추상 클래스 내의 추상 메서드 = 하위 클래스가 구현해야 하는 메서드)
	
	@Override
	public void display() {//Computer클래스에서 추상으로 선언된 메서드 구현
		System.out.println("DeskTop display");
	}
	@Override
	public void typing() {//Computer클래스에서 추상으로 선언된 메서드 구현
		System.out.println("DeskTop typing");
	}
	@Override
	public void turnOn() {//재정의 해도 되고 안해도됨
		System.out.println("DeskTop turnon");
	}
	@Override
	public void turnOff() {//재정의 해도 되고 안해도됨
		System.out.println("Desktop turnoff");
	}
}
