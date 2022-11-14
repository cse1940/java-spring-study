package ch03;

public class VIPCustomer extends Customer {
	private int agentID;
	double salesRatio;
	
//	public VIPCustomer() {
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		customerGrade = "VIP";
//		
//		System.out.println("VIPCustomer() 호출");
//	}
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}
	
	public int getAgentID() {
		return agentID;
	}
}
