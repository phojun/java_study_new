package ch38.inheritance.com;

public class VipCustomer extends Customer{
	
	double salesRatio;
	private int agentID;
	
	public VipCustomer() {
		bonusRatio=0.05;
		salesRatio=0.1;
		customerGrade="VIP";
	}
	
	public int getAgentID() {
		return agentID;
	}
}
