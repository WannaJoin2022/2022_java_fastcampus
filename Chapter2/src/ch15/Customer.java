package ch15;

public class Customer {

	
	String customer;
	int money;
	int count;
	
	
	public Customer(String customer, int money) {
		this.customer = customer;
		this.money = money;
	}
	
	public void take(int paid){
		money -= paid;
	}
	
	public void showInfo() {
		System.out.println(customer + "님의 남은 돈은 " + money + " 원 입니다.");
	}
	
	
}
