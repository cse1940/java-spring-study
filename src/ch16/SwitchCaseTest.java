package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("오늘은 몇 월인가요?");
		int month = scanner.nextInt();
		int day;
		
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4, 6, 9, 11:
			day = 30;
			break;
		default:
			day = -1;
			System.out.println("존재하지 않는 달입니다.");
			break;
		}
		System.out.println("입력하신 " + month + "월은 " + day + "일 입니다.");
	}

}
