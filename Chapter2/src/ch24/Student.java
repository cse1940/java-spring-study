package ch24;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	
	ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	public void addSubject(String name, int point) {
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setScorePoint(point);
		subjectList.add(subject);
	}
	 
	public void showStudentInfo() {
		int total = 0;
		
		for(Subject subject : subjectList) {
			total += subject.getScorePoint();
			System.out.println(studentName + "학생의 " + subject.getName() + "과목의 성적은 " + subject.getScorePoint() + "점 입니다.");
		}
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
}
