package ch15;

public class Student {
	String name;
	int money;
	
	public Student(String name, int money) {
		this.money = money;
		this.name = name;
	}
	
	public void takeTaxi() {
		this.money -= 10000;
	}
	
	public void StudentInfo() {
		System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
	}
}
