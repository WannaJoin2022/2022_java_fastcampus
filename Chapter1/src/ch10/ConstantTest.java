package ch10;

public class ConstantTest {

	public static void main(String[] args) {

		double dNum = 1.2;
		float fNum = 0.9F;
		
		// 1 + 0 = 1
		int iNum1 = (int)dNum + (int)fNum;
		
		// double (8����Ʈ), float(4����Ʈ) �̹Ƿ� float�� ����ȯ�� �ȵ� (double > float)
		// float iNum3 = dNum + fNum;
		double iNum2 = dNum + fNum;
		
		// 1.2 + 0.9 = (int) 2.1 = 2
		int iNum3 = (int)(dNum + fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		System.out.println(iNum3);


	}

}
