package ch40.overriding.com;

public class CustomerTest {
	
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo()+price);
			
		//하위 클래스를 생성하면 상위 클래스가 먼저 생성 됨 
		VipCustomer customerKim = new VipCustomer(10020,"김유신");
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo()+price);
		
		//업캐스팅 형변환 
		Customer vc = new VipCustomer(12345,"kim");//vipcustomer로 만들어 졌지만 type은 customer 이다.
		price = vc.calcPrice(1000);
		System.out.println(vc.showCustomerInfo()+price);//price가격은 vipcustomer의 매서드가 호출되어 계산됨
		
		//WHY????
		// vc 변수의 타입은 Customer지만 인스턴스의 타입은 VIPCustomer 임
		// 자바에서는 항상 인스턴스의 메서드가 호출 됨 (가상메서드의 원리)
		// 자바의 모든 메서드는 가상 메서드(virtual method) 임
		
	}
 
}
