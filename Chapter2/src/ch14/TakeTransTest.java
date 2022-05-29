package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Strudent studentJ = new Strudent("James", 5000);
		Strudent studentT = new Strudent("Tomas", 10000);
		
		Bus bus100 = new Bus (100);
		Subway subwayGreen = new Subway (2);
		
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwayGreen);
		
		studentJ.showInfo();
		studentT.showInfo();
		
		bus100.showBusInfo();
		subwayGreen.showSubwayInfo();
		
		
		
		
	}
	

}
