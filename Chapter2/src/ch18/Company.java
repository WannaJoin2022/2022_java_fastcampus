package ch18;

public class Company {

	// 유일한 객체 (static)
	private static Company instance = new Company();
	
	// 외부에서 접근 할 수 없도록 private 으로 생성 
	private Company() {}
	
	public static Company getInstance() {
		if( instance == null) {
			instance = new Company();
		}
		return instance;
		
	}

}
