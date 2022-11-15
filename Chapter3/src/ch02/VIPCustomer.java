package ch02;

public class VIPCustomer extends Customer{
	int agentID;
	double salesRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

}
