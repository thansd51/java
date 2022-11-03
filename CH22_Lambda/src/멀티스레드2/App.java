package 멀티스레드2;

public class App {

	private int value = 0; //공유 변수

	public void run() throws InterruptedException {
		Runnable runnable = () -> {
			for (int i = 0; i < 1000; i++) {
				value++;
			}
		};
		
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
		t1.start(); //스레드 실행
		t2.start();
		
		System.out.println("Value: " + value);
		
		t1.join(); //메인스레드가 t1스레드의 동작을 마칠 때까지 기다림
		t2.join();
		
		System.out.println("Value: " + value);
		
	}

	public static void main(String[] args) throws InterruptedException {
		new App().run();
	}

}
