package ch39.inheritance.com;

public class CustomerTest {
	
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
			
		//하위 클래스를 생성하면 상위 클래스가 먼저 생성 됨 
		VipCustomer customerKim = new VipCustomer(10020,"김유신");
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		//업캐스팅 형변환 
		Customer vc = new VipCustomer(12345,"kim");//vipcustomer로 만들어 졌지만 type은 customer 이다.
		vc.setCustomerGrade("SILVER");//customer 클래스의 매서드라 사용가능
		//vc.getAgentID;(vipcustomer 클래스의 매서드이나 customer로 형변환 되어 사용 불가)
	}
 
}
