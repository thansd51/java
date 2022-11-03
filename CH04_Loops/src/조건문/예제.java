package 조건문;

import java.util.Scanner;

public class 예제 {

	public static void main(String[] args) {
		System.out.println("메뉴");
		System.out.println("====\n");
		System.out.println("1. 프린트 '헬로우'");
		System.out.println("2. 프린트 '안녕 ?'");
		System.out.println("3. 프로그램 종료\n");

		Scanner scanner = new Scanner(System.in);
		System.out.printf("옵션을 선택 > ");
		int number = scanner.nextInt();
		scanner.close();

		if (number == 1) {
			System.out.println("헬로우");
		}

		else if (number == 2) {
			System.out.println("안녕 ?");
		}

		else if (number == 3) {
			System.out.println("종료합니다 ...");
		}

		else if (number == 10000) {
			System.out.println("이스터에그를 발견했습니다.");
		}

		else {
			System.out.println("잘못된 옵션입니다.");
		}

	}

}
