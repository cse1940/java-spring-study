package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "정하리");
		
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "이하나");
		
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
	}

}
