package ch08;

public class StringTest {

	public static void main(String[] args) {

		char ch1 = 'A';
		System.out.println("ch1 문자 : " + ch1);
		System.out.println("ch1 숫자 : " + (int)ch1);
		
		
		// ch2 타입을 char라고 지정해 두었기 때문에 문자로 인식해서 B를 출력
		char ch2 = 66;
		System.out.println("ch2 문자 : " + ch2);
		
		int ch3 = 67;
		System.out.println("ch3 숫자 : " + ch3);
		System.out.println("ch3 문자 : " + (char)ch3);
		
		//char ch4 = -66;  음수는 대입 할 수 없음

		char ch5 = '한';
		char ch6 = '\uD55C';
		
		System.out.println("ch5 문자 : " + ch5);
		System.out.println("ch6 문자 : " + ch6);


	}

}
