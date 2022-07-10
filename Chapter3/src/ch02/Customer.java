package ch02;

public class Customer {

	// 고객정보 private
	// private이면 상속받아 사용 할 수 없다.
	// 상위 클래스에서는 접근할 수 없지만, 하위클래스에서는 접근 할 수 있도록 protected를 사용해준다
	// protexted 는 하위클래스에서는 접근이 가능하지만 외부에서는 접근 불가하다
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + " 이며, 보너스 포인트는 " + bonusPoint + " 이다. " ; 
	}
	
}
