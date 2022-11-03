package 반복문;

import java.util.Scanner;

public class 패스워드체크 {

	public static void main(String[] args) {
		// 유저가 입력한 패스워드를 설정한 패스워드와 비교
		final String USER_PASSWORD = "hello";

		Scanner scanner = new Scanner(System.in);
		String password = null;

		do {
			System.out.println("Enter password > ");
			password = scanner.nextLine();
		} while (!password.equals(USER_PASSWORD));
		scanner.close();

		System.out.println("접속 승인.");
	}

}
