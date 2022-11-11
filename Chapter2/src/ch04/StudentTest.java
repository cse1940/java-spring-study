package ch04;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(); // Student클래스를 기반으로 studentLee인스턴스 생성
		
		studentLee.studentId = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울시 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		
		studentKim.studentId = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "경기도 수원시";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
