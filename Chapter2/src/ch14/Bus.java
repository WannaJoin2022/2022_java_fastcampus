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
		System.out.println(busNum + "번 버스의 승객은" + count + "명 이고, 수입은 " + money + "원 입니다.");
	}

}
