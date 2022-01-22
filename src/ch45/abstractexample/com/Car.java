package ch45.abstractexample.com;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
			
	final public void run() {//변하면 안되는 시나리오라 final로 재정의 못하게 선언
		startCar();
		drive();
		stop();
		turnOff();
	}
}
