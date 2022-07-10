package ch02;

// customer class에서 상
public class VIPCustomer extends Customer {

	double saleRatio;
	private String agentID;
	
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public String getAgentID() {
		return agentID;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + " 이며, 보너스 포인트는 " + bonusPoint + "이다" ; 
	}
	
	
	
	
}
