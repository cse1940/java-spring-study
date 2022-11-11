package ch08;

public class OrderTest {

	public static void main(String[] args) {
		Order order1 = new Order();
		
		order1.orderNumber = "202011020003";
		order1.customerPhone = "01023450001";
		order1.custormerAddress = "서울시 강남구 역삼동 111-111";
		order1.orderDate = "20221111";
		order1.orderTime = "130258";
		order1.price = 35000;
		order1.menuId = "0003";
		
		order1.showOrder();
	}

}
