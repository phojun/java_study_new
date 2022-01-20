package ch40.overriding.com;

public class VipCustomer extends Customer{
	
	double salesRatio;
	private int agentID;
	
	/*
	 * public VipCustomer() { super();//생략되어있음 이때 반드시 상위 클래스의 기본 생성자가 존재 해야 함 기본생성자
	 * 없을 때 오류 생김 bonusRatio=0.05; salesRatio=0.1; customerGrade="VIP";
	 * System.out.println("VipCustomer() 호출"); }
	 */
	public VipCustomer(int customerID, String customerName) {//상위클래스에 기본생성자가 없는경우의 호출방식
		super(customerID, customerName);
		 bonusRatio=0.05; 
		 salesRatio=0.1; 
		 customerGrade="VIP";
		 System.out.println("VipCustomer(int,String) 호출");
	}
	
	public int getAgentID() {
		return agentID;
	}

	@Override
	public int calcPrice(int price) {//매소드를 재정의 할 수도, 그대로 쓸 수도 있다 Override를 통해
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	
}
