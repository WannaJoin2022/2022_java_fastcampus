package ch15;

public class CompanyTaxi {

	
	String Company;
	int paid;
	int money;
	
	public CompanyTaxi(String Company) {
	 	this.Company = Company;
	}
	
	public void take(int paid){
		money += paid;
		
	}
	
	public void showInfo() {
		System.out.println(Company + " �ý� ������" + money + " �� �Դϴ�.");
	}
	
	
}
