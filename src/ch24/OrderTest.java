package ch24;

public class OrderTest {
	/*
	 * 주문 접수 번호 : 202011020003 
	 * 주문 핸드폰 번호 : 01023450001 
	 * 주문 집 주소 : 서울시 강남구 역삼동 111-333
	 * 주문 날짜 : 20201102 
	 * 주문 시간 : 130258 
	 * 주문 가격 : 35000 
	 * 메뉴 번호 : 0003
	 */

	public static void main(String[] args) {
		
		Order userOrder = new Order("202011020003", "01023450001", " 서울시 강남구 역삼동 111-333", "0003",35000);
		userOrder.setOrderDate();
		userOrder.setOrderTime();
		
		System.out.println(userOrder.toString());
	}

}
