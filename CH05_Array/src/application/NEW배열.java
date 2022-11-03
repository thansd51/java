package application;

import java.util.Scanner;

public class NEW배열 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] numbers = new int[3];

		for (int i = 0; i < 3; i++) {
			System.out.printf("숫자를 입력: ");

			numbers[i] = scanner.nextInt();
		}

		scanner.close();

		System.out.println("입력한 값은: ");

		int total = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println(numbers[i]);

			total = total + numbers[i];
		}

		System.out.printf("Total: %d", total);
	}

}
