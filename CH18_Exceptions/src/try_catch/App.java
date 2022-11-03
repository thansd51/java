package try_catch;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자를 입력 : ");
		String line = scanner.nextLine(); // 문자열 입력

		int number = 0;
		boolean isNumber = false;

		try {
			number = Integer.parseInt(line); // 예외 발생 코드
			isNumber = true;

		} catch (NumberFormatException e) {
			// NumberFormat 숫자변환 예외 발생 시 catch에서 실행
			System.out.println("숫자 입력이 아닙니다.");
		}
		if (isNumber) {

			System.out.println("입력한 숫자는 : " + number);
		}
		scanner.close();
	}

}