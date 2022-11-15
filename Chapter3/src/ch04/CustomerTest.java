package ch04;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "최수지");
		customerLee.bonusPoint = 1000;
		System.out.println(customerKim.showCustomerInfo());
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo() + " 지불금액은 " + priceLee + "원 입니다.");
		System.out.println(customerKim.showCustomerInfo() + " 지불금액은 " + priceKim + "원 입니다.");
		
//		cv 변수의 타입은 Customer지만 인스턴스의 타입은 VIPCustomer임
		Customer cv = new VIPCustomer(10030, "정하나");
		cv.bonusPoint = 10000;
		int pricecv = cv.calcPrice(10000);
		System.out.println(cv.showCustomerInfo() + " 지불금액은 " + pricecv + "원 입니다.");
	}

}
