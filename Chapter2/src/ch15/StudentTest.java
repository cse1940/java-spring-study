package ch15;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student("Edward", 20000);
		
		s.takeTaxi();
		s.StudentInfo();
		
		Taxi t = new Taxi("잘나간다 운수", 0);
		
		t.income();
		t.incomeInfo();
	}

}
