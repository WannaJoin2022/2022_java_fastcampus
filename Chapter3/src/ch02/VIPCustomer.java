package ch02;

// customer class���� ��
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
		return customerName + "���� ����� " + customerGrade + " �̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�̴�" ; 
	}
	
	
	
	
}
