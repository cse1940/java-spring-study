package ch21;

public class ContinueTest {

	public static void main(String[] args) {
//		Q. 1부터 100까지 숫자 중 3의 배수 출력
		for(int num=1; num<=100; num++) {
			if((num%3) != 0)
				continue;
			System.out.println(num);
		}
	}

}
