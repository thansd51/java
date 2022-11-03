package 멀티스레드작업;

public class App {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> longTask());
		//longTask(); // 긴 작업 시작(메인 스레드)
		thread.start();
		System.out.println("메인스레드 동작");
	}

	private static void longTask() {
		long t = System.currentTimeMillis();
		long end = t + 3000;

		while (true) {
			if (System.currentTimeMillis() == end) {
				System.out.println("긴 작업 종료");
				break;
			}
		}
	}
}
