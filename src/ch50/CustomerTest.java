package ch50;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		//업캐스팅을 해보자
		Buy buyer = customer;
		//Buy인터페이스에서 지정된 메서드들만 쓸 수 있다
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		//Sell인터페이스에서 지정된 메서드들만 쓸 수 있다
		seller.sell();
		seller.order();
	}

}
