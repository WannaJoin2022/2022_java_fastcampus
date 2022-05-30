package ch18;

public class Company {

	// ������ ��ü (static)
	private static Company instance = new Company();
	
	// �ܺο��� ���� �� �� ������ private ���� ���� 
	private Company() {}
	
	public static Company getInstance() {
		if( instance == null) {
			instance = new Company();
		}
		return instance;
		
	}

}
