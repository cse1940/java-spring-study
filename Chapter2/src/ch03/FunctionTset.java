package ch03;

public class FunctionTset {
	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calcSum() {
		int sum = 0;
		for(int i=0; i<100; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		System.out.println(total);
		
		sayHello("안녕하세요, 저는 최승은 이라고 합니다.");
		
		total = calcSum();
		System.out.println(total);
	}

}
