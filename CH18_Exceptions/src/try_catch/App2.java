package try_catch;

import java.util.Scanner;

public class App2 {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int number = getNumber();
		System.out.println("입력한 숫자는 : " + number);
		scanner.close();
	}

	/**
	 * 스캐너로 숫자를 입력받아서 리턴할
	 * 
	 * @return 입력받은정수
	 **/
	private static int getNumber() {
		int number = 0;
		boolean isNumber = false;

		do {
			System.out.print("숫자를 입력 : ");
			String line = scanner.nextLine();

			try {
				number = Integer.parseInt(line);
				isNumber = true;
			} catch (NumberFormatException e) {
				System.out.println("숫자 입력이 아닙니다.");
			}

		} while (!isNumber);

		return number;

	}

}