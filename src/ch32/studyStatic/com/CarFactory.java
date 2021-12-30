package ch32.studyStatic.com;

/*자동차 공장이 있습니다. 자동차 공장은 유일한 객체이고, 이 공장에서 생산되는 자동차는 제작될 때마다 고유의 번호가 부여됩니다. 
자동차 번호가 10001부터 시작되어 자동차가 생산될 때마다 10002, 10003 이렇게 번호가 붙도록 자동차 공장 클래스, 자동차 클래스를 구현하세요
다음 CarFactoryTest.java 테스트 코드가 수행 되도록 합니다.*/

public class CarFactory {
	
	private static CarFactory instance= new CarFactory();//유일무이 객체 생성
	
	private CarFactory() {//private로 비공개 생성자 선언
		
	}
	public static CarFactory getInstance() {//public으로 생성자를 가져올 수 있는 메서드 선언
		if(instance==null) {
			instance=new CarFactory();
		}
		return instance;
	}
	public Car createCar() {//createCar메서드 선언
		Car car =new Car();
		
		return car;

	}
}
