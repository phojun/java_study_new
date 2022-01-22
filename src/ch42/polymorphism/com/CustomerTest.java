package ch42.polymorphism.com;

import java.util.ArrayList;

public class CustomerTest {
	
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer(10010,"tomas");
		Customer customerJ = new Customer(10020,"james");
		Customer customerE= new GoldCustomer(10030,"edward");
		Customer customerP = new GoldCustomer(10040,"park");
		Customer customerK = new VipCustomer(10050,"kim",12345);
		
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerE);
		customerList.add(customerP);
		customerList.add(customerK);
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 1000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			
			System.out.println(customer.getCustomerName()+"님이 " + cost + "원 지불하셨습니다." );
			System.out.println(customer.getCustomerName()+"님의 현재 보녀스 포인트는 " + customer.bonusPoint + "입니다.");
		}
	}
 
}
