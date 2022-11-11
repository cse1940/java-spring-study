package ch09;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "Lee");
		
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 97);
		
		Student studentKim = new Student(200, "Kim");
		
		studentKim.setKoreaSubject("국어", 88);
		studentKim.setMathSubject("수학", 75);
		
		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
	}

}
