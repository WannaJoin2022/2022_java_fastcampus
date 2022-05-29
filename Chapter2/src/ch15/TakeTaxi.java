package ch15;

public class TakeTaxi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String customer;
		int money;
		int paid;
		
		
		Customer customerE = new Customer("Edward", 20000);
		CompanyTaxi takeTaxi = new CompanyTaxi("잘나간다 운수");
		
		
		customerE.take(10000);
		takeTaxi.take(10000);
		
		
		customerE.showInfo();
		takeTaxi.showInfo();
	}
}
