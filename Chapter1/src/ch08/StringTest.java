package ch08;

public class StringTest {

	public static void main(String[] args) {

		char ch1 = 'A';
		System.out.println("ch1 ���� : " + ch1);
		System.out.println("ch1 ���� : " + (int)ch1);
		
		
		// ch2 Ÿ���� char��� ������ �ξ��� ������ ���ڷ� �ν��ؼ� B�� ���
		char ch2 = 66;
		System.out.println("ch2 ���� : " + ch2);
		
		int ch3 = 67;
		System.out.println("ch3 ���� : " + ch3);
		System.out.println("ch3 ���� : " + (char)ch3);
		
		//char ch4 = -66;  ������ ���� �� �� ����

		char ch5 = '��';
		char ch6 = '\uD55C';
		
		System.out.println("ch5 ���� : " + ch5);
		System.out.println("ch6 ���� : " + ch6);


	}

}
