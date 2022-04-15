package ch06;

public class VariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		byte bnum = -128;
//		btye가 표현할 수 있는 양수 범위는 ~127 까지이므로 오류 발생
//		byte cnum = 128;
		
//		int 타입으로 표현하기는 너무 숫자가 길어서, long 타입으로 표현해야해
//		int num = 123456780012345;
		long lNum = 121234123434567890L;
		
		System.out.println(bnum);
		System.out.println(lNum);

	}

}
