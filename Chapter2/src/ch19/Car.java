package ch19;

public class Car {

	private static int Num = 10000;

	public static int getCarNum () {
		return ++Num;
	}
}
