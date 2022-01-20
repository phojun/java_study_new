package ch38.inheritance.com;

/*회사에서 고객 정보를 활용한 맞춤 서비스를 하기 위해 일반고객(Customer)과 
이보다 충성도가 높은 우수고객(VIPCustomer)에 따른 서비스를 제공하고자 함

물품을 구매 할때 적용되는 할인율과 적립되는 보너스 포인트의 비율이 다름 
여러 멤버십에 대한 각각 다양한 서비스를 제공할 수 있음
멤버십에 대한 구현을 클래스 상속을 활용하여 구현해보기*/
public class Customer {
	//protected는 하위클래스에서 접근 가능
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {//기본생성자
		super();
		customerGrade="SILVER";
		bonusRatio=0.01;
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + 
				"이며, 보너스 포인트는" + bonusPoint + "입니다";
		
	}
	
	
}
