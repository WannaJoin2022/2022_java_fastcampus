package ch03;

// customer class���� ��
public class VIPCustomer extends Customer {


	double saleRatio;
	private String agentID;
	
	
//	public VIPCustomer() {
//		// ����Ŭ������ ����Ŭ������ �����ڸ� ȣ��, 
//		// ����Ŭ������ ȣ���ϴ� Ű���尡 ������ �ڵ����� ����
//		super(0, null);
//		super();
//		
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//		
//		System.out.println("VIPCustomer() ������ ȣ��");
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
		return customerName + "���� ����� " + customerGrade + " �̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�̴�" ; 
	}
	
	
	
	
}
