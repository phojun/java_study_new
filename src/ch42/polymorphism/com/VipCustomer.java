package ch42.polymorphism.com;

public class VipCustomer extends Customer{
	
	double salesRatio;
	private int agentID;
	
	/*
	 * public VipCustomer() { super();//생략되어있음 이때 반드시 상위 클래스의 기본 생성자가 존재 해야 함 기본생성자
	 * 없을 때 오류 생김 bonusRatio=0.05; salesRatio=0.1; customerGrade="VIP";
	 * System.out.println("VipCustomer() 호출"); }
	 */
	public VipCustomer(int customerID, String customerName, int agentID) {//상위클래스에 기본생성자가 없는경우의 호출방식
		super(customerID, customerName);
		this.agentID=agentID;
		 bonusRatio=0.05; 
		 salesRatio=0.1; 
		 customerGrade="VIP";
		
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price*salesRatio);
	}
	@Override
	public String showCustomerInfo(){
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다";  
}
	
	public int getAgentID() {
		return agentID;
	}
}
