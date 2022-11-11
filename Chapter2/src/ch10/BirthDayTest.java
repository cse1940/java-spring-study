package ch10;

public class BirthDayTest {

	public static void main(String[] args) {
		BirthDay date = new BirthDay();
		BirthDay date2 = new BirthDay();
		
		date.setYear(1999);
		date.setMonth(10);
		date.setDay(6);
		
		date2.setYear(2022);
		date2.setMonth(13);
		date2.setDay(1);
		
		date.showDate();
		date2.showDate();
	}

}
