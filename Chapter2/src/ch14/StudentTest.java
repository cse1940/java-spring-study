package ch14;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student("James", 5000);
		Student s2 = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		
		s.takeBus(bus100);
		
		Subway greenSubway = new Subway(2);
		Subway blueSubway = new Subway(4);
		
		s2.takeSubway(greenSubway);
		
		s.showInfo();
		s2.showInfo();
		
		bus100.showBusInfo();
		greenSubway.showSubwayInfo();
	}
}
