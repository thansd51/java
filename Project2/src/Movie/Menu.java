package Movie;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Menu {

	private Scanner scanner = new Scanner(System.in);
	private boolean isRunning = true;
	Movies[] movies = new Movies[4];

	public void run() {
		while (isRunning) {

			displayMenu();

		}

		scanner.close();
	}

	private void displayMenu() {
		System.out.println("****|CGV|****");
		System.out.println("1. 영화 일정");
		System.out.println("2. 회원 가입");
		System.out.println("3. 예매하기");
		System.out.println("4. 포인트 조회");
		System.out.println("5. 프로그램 종료");

		System.out.println();
		System.out.println("번호를 입력 해주세요.");
		try {
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				schedule();
				break;
			case 2:
				register();
				break;
			case 3:
				reserve();
				break;
			case 4:
				inquiry();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다!");
				isRunning = false;
				break;

			default:
				System.out.println("지원하지 않는 번호입니다.");
			}
		} catch (InputMismatchException e) {
			System.out.println("인식되지 못하여 종료되었습니다.");
			isRunning = false;
		}

	}

	public void schedule() {
		System.out.println("=====================");
		System.out.println("[ 상영일 ]");
		System.out.println("08월 (01~03)일");
		System.out.println();
		System.out.println("날짜를 입력하세요: ");

		String day = scanner.next();
		list(day);
	}
	
	public void list(String day) {
			switch (day) {
			case "1":
				first();
				break;
			case "1일":
				first();
				break;
			case "2":
				second();
				break;
			case "2일":
				second();
				break;
			case "3":
				third();
				break;
			case "3일":
				third();
				break;
			default:
				System.out.println("상영일이 아닙니다.");
				System.exit(0);
				break;
			}

	}

	public void first() {
		movies[0] = new Movies(1,"한산-용의 출현");
		movies[1] =new Movies(2,"비상 선언");
		movies[2] =new Movies(3,"미니언즈2");
		movies[3] =new Movies(4,"탑건-매버릭");
		
	}

	private void second() {
		// TODO Auto-generated method stub
		
	}

	private void third() {
		// TODO Auto-generated method stub
		
	}

	private void register() {
		// TODO Auto-generated method stub

	}

	private void reserve() {
		// TODO Auto-generated method stub

	}

	private void inquiry() {
		// TODO Auto-generated method stub

	}

}
