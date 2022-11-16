package ch11;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		
//		인터페이스를 구현한 클래스는 인터페이스 형으로 선언한 변수로 형변환 할 수 있음
		Calc calc = new CompleteCalc();
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
	}

}
