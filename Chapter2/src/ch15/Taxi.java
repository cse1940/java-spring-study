package ch15;

public class Taxi {
	int money;
	String taxiName;
	
	public Taxi(String taxiName, int money) {
		this.taxiName = taxiName;
		this.money = money;
	}
	
	public void income() {
		this.money += 10000;
	}
	
	public void incomeInfo() {
		System.out.println(taxiName + " 수입은 " + money + "원 입니다.");
	}
}
