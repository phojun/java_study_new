package ch24;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Order {
	
	private String orderDate;
	private String orderTime;
	private String orderNo,phoneNo,address, menuNo;
	private int price;
	
	public Order() {
		super();
	}

	public Order(String orderNo, String phoneNo, String address, String menuNo, int price) {
		super();
		this.orderNo = orderNo;
		this.phoneNo = phoneNo;
		this.address = address;
		this.menuNo = menuNo;
		this.price = price;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate() {
		LocalDate date = LocalDate.now();
		this.orderDate = date.toString();
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime() {
		LocalTime time = LocalTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("HHmmss");
		this.orderTime = time.format(format);
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMenuNo() {
		return menuNo;
	}

	public void setMenuNo(String menuNo) {
		this.menuNo = menuNo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [orderDate=" + orderDate + ", orderTime=" + orderTime + ", orderNo=" + orderNo + ", phoneNo="
				+ phoneNo + ", address=" + address + ", menuNo=" + menuNo + ", price=" + price + "]";
	}
	
}
