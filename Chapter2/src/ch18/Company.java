package ch18;

public class Company {
	private static Company instance = new Company(); // 유일한 객체가 됨
	
	private Company() {}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
