package ch19;

public class CarFactory {
	 private static CarFactory instance = new CarFactory(); // 자동차 공장은 유일한 객체
	 
	 private CarFactory() {}
	 
	 public static CarFactory getInstance() {
		 if(instance == null) {
			 instance = new CarFactory();
		 }
		 return instance;
	 }
	 
	 public Car createCar() {
		 Car car = new Car();
		 return car;
	 }
}
