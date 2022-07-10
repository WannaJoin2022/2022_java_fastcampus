package ch03;

// customer class에서 상
public class VIPCustomer extends Customer {


	double saleRatio;
	private String agentID;
	
	
//	public VIPCustomer() {
//		// 하위클래스가 상위클래스의 생성자를 호출, 
//		// 상위클래스를 호출하는 키워드가 없으면 자동으로 생성
//		super(0, null);
//		super();
//		
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//		
//		System.out.println("VIPCustomer() 생성자 호출");
//
//	}

	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
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
