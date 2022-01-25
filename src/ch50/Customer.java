package ch50;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("Customer Sell");
		
	}

	@Override
	public void buy() {
		System.out.println("Customer Buy");
		
	}

	@Override
	public void order() {
		System.out.println("Customer order");
	}
	
	public void hello() {
		System.out.println("Customer Hello");
	}

	//중첩된 메서드로 인해 오류 발생 --> 반드시 둘중하나를 선택하던가 재정의를 해야 함
	


}
