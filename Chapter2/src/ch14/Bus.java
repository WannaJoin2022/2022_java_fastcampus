package ch14;

public class Bus {

	int busNum;
	int count;
	int money;
	
	
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	public void take(int money) {
		this.money += money;
		count++;
	}
	
	public void showBusInfo() {
		System.out.println(busNum + "�� ������ �°���" + count + "�� �̰�, ������ " + money + "�� �Դϴ�.");
	}

}