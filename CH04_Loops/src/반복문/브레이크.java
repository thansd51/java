package 반복문;

public class 브레이크 {

	public static void main(String[] args) {
		int count = 0;

		while (true) {
			System.out.println("헬로우. " + count);

			if (count == 5) { // count가 5가 되면
				break; // 반복문을 빠져 나온다.

			}
			System.out.println("How are you.");

			count++;

		}

		System.out.println("Program finished.");
	}

}
