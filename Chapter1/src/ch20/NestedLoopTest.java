package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {
//		1. for문을 활용한 구구단
		int dan = 2;
		int count = 1;
		
		for(dan = 2; dan <= 9; dan++) {
			for(count = 1; count <=9; count++) {
				System.out.println(dan + "X" + count + "=" + dan*count);
			}
			System.out.println();
		}
		
//		2. while문을 활용한 구구단
		dan = 2;
		while(dan <= 9) {
			count = 1;
			while (count <= 9) {
				System.out.println( dan + "X" + count + "=" + dan * count);
				count++;
			}
			dan++;
			System.out.println();
		}

	}
	
}
