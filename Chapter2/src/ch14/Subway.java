package ch14;

public class Subway {

	int lineNum;
	int count;
	int money;
	
	
	
	public Subway(int lineNum) {
		this.lineNum = lineNum;
	}
	
	public void take(int money) {
		this.money += money;
		count++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNum + "�� ����ö�� �°���" + count + "�� �̰�, ������ " + money + "�� �Դϴ�.");
	}

}
