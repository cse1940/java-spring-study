package ch14;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 표준 입력
		
		System.out.println("당신의 나이를 입력해 주세요. ");
		int age = scanner.nextInt();
		
		if(age >= 8) 
			System.out.println("학교에 다닙니다.");
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
	}

}
