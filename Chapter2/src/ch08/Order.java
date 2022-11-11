package ch08;

public class Order {
	String orderNumber;
	String customerPhone;
	String custormerAddress;
	String orderDate;
	String orderTime;
	int price;
	String menuId;
	
	public void showOrder() {
		System.out.println("주문 접수 번호 : " + orderNumber);
		System.out.println("주문 핸드폰 번호 : " + customerPhone);
		System.out.println("주문 집 주소 : " + custormerAddress);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문 시간 : " + orderTime);
		System.out.println("주문 가격 : " + price);
		System.out.println("메뉴 번호 : " + menuId);
	}
}
