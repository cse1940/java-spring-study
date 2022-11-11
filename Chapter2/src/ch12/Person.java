package ch12;

public class Person {
	int age;
	String name;
	
	public Person() {
		this("이름없음", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		System.out.println(name + ", " + age);
	}
	
	public Person getPerson() { // 자신의 주소를 반환함
		return this;
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		Person person2 = new Person();
		
		person.showPerson();
		
		person2.age = 24;
		person2.name = "최승은";
		
		System.out.println(person.getPerson());
		System.out.println(person2.getPerson());
	}
}
