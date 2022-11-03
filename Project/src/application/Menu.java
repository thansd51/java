package application;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
;

public class Menu {
	private Scanner scanner = new Scanner(System.in);

	private ArrayList<User> users = new ArrayList<>();
	
	

	// 영화예매 프로그램 시작
	public void run() {
		displayMenu();
	}

	// 메뉴 출력
	private void displayMenu() {

		System.out.println("****|CGV|****");
		System.out.println("1. 영화 일정");
		System.out.println("2. 회원 가입");
		System.out.println("3. 예매하기");
		System.out.println("4. 포인트 조회");

		System.out.println();
		System.out.println("번호를 입력 해주세요.");

		try {
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				movieSchedule();
				break;
			case 2:
				registerAccount();
				break;
			case 3:
				reserveAccount();
				break;
			case 4:
				checkAccount();
				break;

			default:
				System.out.println("지원하지 않는 번호입니다.");
			}
		} catch (InputMismatchException e) {
			System.out.println("인식되지 못하여 종료되었습니다.");
		}
	}

	// 회원가입
	public void registerAccount() {

		System.out.println("====================================================");
		System.out.println("#  회원가입을 진행합니다.");

		String id = input(1);
		String password = input(2);

		System.out.println("ID가 생성되었습니다!");
		users.add(new User(id, password));

		System.out.println("====================================================");
		System.out.println(id + "님 환영합니다. 원하시는 날짜와 영화를 선택해주세요.");

		reserveAccount();
	}

	private String input(int join) {

		String result = null;

		switch (join) {
		case 1:
			while (true) {
				System.out.println("id를 입력하세요.");

				result = scanner.nextLine();

				if (result.trim().isEmpty()) {
					System.out.println("id는 공백을 허용하지 않습니다.");
				} else {
					break;
				}
			}
			break;
		case 2:
			while (true) {
				System.out.println("비밀번호를 입력하세요.");
				result = scanner.nextLine();

				System.out.println("비밀번호 확인을 입력하세요!");
				String passwordCheck = scanner.nextLine();

				if (result.trim().isEmpty() || passwordCheck.trim().isEmpty()) {
					System.out.println("비밀번호 또는 비밀번호 확인이 공백입니다!");
				} else if (!result.equals(passwordCheck)) {
					System.out.println("비밀번호와 비밀번호 확인이 일치하지 않습니다!");
				} else {
					break;
				}
			}
			break;

		case 3:
			while (true) {
				System.out.println("비밀번호를 입력하세요!");
				result = scanner.nextLine();

				if (result.trim().isEmpty()) {
					System.out.println("비밀번호가 공백입니다!");
				} else {
					break;
				}
			}
			break;
		}

		return result;
	}

	private void movieSchedule() {
		System.out.println("=====================");
		System.out.println("[ 상영일 ]");
		System.out.println("08월 (01~03)일");
		System.out.println();
		System.out.println("날짜를 입력하세요: ");

		String day = scanner.nextLine();

		
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
				movieSchedule();
				break;
			}
		
	}

	private void first() {
		new Movies(1,"한산-용의 출현");
		new Movies(2,"비상 선언");
		new Movies(3,"미니언즈2");
		new Movies(4,"탑건-매버릭");

	}

	private void second() {
		new Movies(1,"한산-용의 출현");
		new Movies(2,"비상 선언");
		new Movies(3,"미니언즈2");
		new Movies(4,"탑건-매버릭");

	}

	private void third() {
		new Movies(1,"한산-용의 출현");
		new Movies(2,"비상 선언");
		new Movies(3,"미니언즈2");
		new Movies(4,"탑건-매버릭");

	}

	private void reserveAccount() {
		System.out.println("=====================");
		System.out.println("1. 회원으로 예매");
		System.out.println("2. 비회원으로 예매");
		System.out.println();
		System.out.println("번호를 입력해주세요.");

		try {
			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				member();
				break;
			case 2:
				nonMember();
				break;

			default:
				System.out.println("존재하지 않는 기능입니다!");
			}
		} catch (InputMismatchException e) {
			System.out.println("안내 되지 않은 번호입니다.");
		}
	}

	public static void member() {
		System.out.println("");

	}

	private void nonMember() {
		// TODO Auto-generated method stub

	}

	private void checkAccount() {
		// TODO Auto-generated method stub

	}

}
