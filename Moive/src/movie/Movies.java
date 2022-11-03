package movie;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Movies {

	static Scanner scanner = new Scanner(System.in);
	private ArrayList<User> users = new ArrayList<>();

	static Map<Integer, String> first = new TreeMap<Integer, String>();
	static Map<Integer, String> second = new TreeMap<Integer, String>();
	static Map<Integer, String> third = new TreeMap<Integer, String>();

	static Map<String, Integer> mCashGrade = new LinkedHashMap<String, Integer>();
	static Map<String, Integer> nCashGrade = new LinkedHashMap<String, Integer>();

	int price = 0;
	int point = 50000;
	int dcash = 0;
	int total = 0;

	public void category() {

		System.out.println("****|CGV|****");
		System.out.println("1. 영화 일정");
		System.out.println("2. 회원 가입");
		System.out.println("3. 예매하기");
		System.out.println("4. 종료");
		System.out.println("\n번호를 선택 해주세요.");

		try {
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				date();
				break;
			case 2:
				joinU();
				break;
			case 3:
				timeTable();
				break;
			case 4:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("지원하지 않는 번호입니다.");
				System.exit(0);
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("인식되지 못하여 종료되었습니다.");
		}
	}

	public void date() {
		first();
		second();
		third();

		System.out.println("\n메인화면으로 가기 : 0번");
		int back = scanner.nextInt();
		if (back == 0) {
			category();
		} else {
			System.out.println("예매하기에서 선택해주세요.");
			category();
		}

	}

	private void first() {
		System.out.println("===========|8월 1일|===========");
		first.put(1, "한산-용의 출현");
		first.put(2, "비상 선언");
		first.put(3, "미니언즈2");
		first.put(4, "탑건-매버릭");

		first.forEach((k, v) -> {
			System.out.println(k + "번 " + v);
		});
	}

	private void second() {
		System.out.println("===========|8월 2일|===========");
		second.put(1, "헌트");
		second.put(2, "외계+인 1부");
		second.put(3, "헤어진 결심");
		second.put(4, "시맨틱 에러-더 무비");

		second.forEach((k, v) -> {
			System.out.println(k + "번 " + v);
		});
	}

	private void third() {
		System.out.println("===========|8월 3일|===========");
		third.put(1, "비상 선언");
		third.put(2, "한산-용의 출현");
		third.put(3, "탑건-매버릭");
		third.put(4, "헌트");

		third.forEach((k, v) -> {
			System.out.println(k + "번 " + v);
		});
	}

	public void joinU() {
		System.out.println("========================================");
		System.out.println("회원가입을 진행합니다.");

		String id = input(1);
		String password = input(2);
		users.add(new User(id, password));

		System.out.println("ID가 생성되었습니다.");

		System.out.println("========================================");
		System.out.println(id + "님 환영합니다.");
		System.out.println("50000포인트가 지급 되었습니다.");
		System.out.println();
		System.out.println("00, 영화 예매 계속하기");
		System.out.println("11, 처음으로 돌아가기");

		int and = scanner.nextInt();
		if (and == 00) {
			timeTable();
		} else if (and == 11) {
			category();
		} else {
			System.out.println("잘못 입력하셨습니다 처음으로 돌아갑니다.");
			category();
		}

	}

	private String input(int join) {

		String result = null;

		switch (join) {
		case 1:
			while (true) {
				System.out.println("id를 입력하세요!");
				result = scanner.nextLine();

				if (result.trim().isEmpty()) {
					System.out.println("id는 공백을 허용하지 않습니다!");
				} else {
					break;
				}
			}
			break;
		case 2:
			while (true) {
				System.out.println("비밀번호를 입력하세요!");
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

	public void timeTable() {
		System.out.println("========================================");
		System.out.println("[ 상영일 ]");
		System.out.println("08월 (01~03)일");
		System.out.println("\n날짜를 입력하세요: ");

		String dday = scanner.next();
		switch (dday) {
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
		System.out.println();
		System.out.println("원하는 영화 번호를 입력해주세요 =>");
		int selectNo = scanner.nextInt();

		if (0 < selectNo && 4 >= selectNo) {
			ticketing();
		} else {
			System.out.println("존재하지 않는 영화입니다.");
		}
	}

	public void ticketing() {
		System.out.println("========================================");
		System.out.println("1. 회원 예매하기");
		System.out.println("2. 비회원 예매하기");
		System.out.println("\n번호를 입력해주세요.");

		int userNo = scanner.nextInt();

		if (userNo == 1) {
			member();
		} else if (userNo == 2) {
			nonMember();
		} else {
			System.out.println("안내 되지 않은 번호입니다.");
			System.out.println("다시 처음으로 돌아갑니다.");
			category();
		}
	}

	public static void memUcash() {
		mCashGrade.put("성인", 9000);
		mCashGrade.put("청소년", 5000);
		mCashGrade.put("어린이", 3000);
		mCashGrade.put("우대", 3000);

		mCashGrade.forEach((k, v) -> {
			System.out.println(k + ", " + v);
		});
	}

	public static void notUcash() {
		nCashGrade.put("성인", 12000);
		nCashGrade.put("청소년", 9000);
		nCashGrade.put("어린이", 5000);
		nCashGrade.put("우대", 5000);

		nCashGrade.forEach((k, v) -> {
			System.out.println(k + ", " + v);
		});
	}

	public void member() {
		System.out.println("========회원========");
		memUcash();
		System.out.println("\n본인의 연령대를 입력해주세요.");
		System.out.println("연령대 입력 ");

		String age = scanner.next();

		switch (age) {
		case "성인":
			int price = mCashGrade.get("성인");
			nCheckout(price);
			break;
		case "청소년":
			price = mCashGrade.get("청소년");
			nCheckout(price);

			break;
		case "어린이":
			price = mCashGrade.get("어린이");
			nCheckout(price);
			break;
		case "우대":
			price = mCashGrade.get("우대");
			nCheckout(price);
			break;
		default:
			System.out.println("입력이 잘못되었습니다.");
			ticketing();
			break;

		}
		System.out.println("\n[1] : CASH");
		System.out.println("[2] : CARD");
		System.out.println("[3] : POINT");
		System.out.printf("선택 => ");

		int payment = scanner.nextInt();

		switch (payment) {
		case 1:
			paymentOnCash();
			break;
		case 2:
			paymentOnCard();
			break;
		case 3:
			paymentOnpoint();
		default:
			System.exit(0);
			break;
		}

	}

	public void nonMember() {
		System.out.println("=======비회원=======");
		notUcash();
		System.out.println("\n본인의 연령대를 입력해주세요.");
		System.out.println("연령대 입력 ");

		String age = scanner.next();

		switch (age) {
		case "성인":
			int price = nCashGrade.get("성인");
			nCheckout(price);
			break;
		case "청소년":
			price = nCashGrade.get("청소년");
			nCheckout(price);

			break;
		case "어린이":
			price = nCashGrade.get("어린이");
			nCheckout(price);
			break;
		case "우대":
			price = nCashGrade.get("우대");
			nCheckout(price);
			break;
		default:
			System.out.println("입력이 잘못되었습니다.");
			ticketing();
			break;
		}

		System.out.println("\n[1] : CASH");
		System.out.println("[2] : CARD");
		System.out.printf("선택 => ");

		int payment = scanner.nextInt();

		switch (payment) {
		case 1:
			paymentOnCash();
			break;
		case 2:
			paymentOnCard();
			break;
		default:
			System.exit(0);
			break;
		}

	}

	public void nCheckout(int price) {
		System.out.printf("결재하실 금액은 %d원 입니다.", price);
		this.price = price;
	}

	public void paymentOnCash() {

		System.out.println("========================================");
		System.out.printf("지불하실 현금을 입력해주세요 : ");

		int cash = scanner.nextInt();

		if (cash >= price) {

			System.out.println("========================================");
			System.out.printf("#  %d원을 지불하셨습니다. 거스름돈은 %d원 입니다.\n", cash, cash - price);
			System.out.println("#  계산이 완료되었습니다. 안녕히 가세요.");
		} else {

			System.out.println("========================================");
			System.out.printf("#  %d원을 더 지불하셔야 합니다.\n", price - cash);
			System.out.println("처음으로 되돌아갑니다.");
			category();
		}

	}

	public void paymentOnCard() {

		System.out.println("========================================");
		System.out.println("#  영수증 필요하신가요?(y/n)");
		System.out.printf("#  선택 -> ");

		String isNeedRecipt = scanner.next();

		switch (isNeedRecipt) {
		case "y":

			System.out.println("========================================");
			System.out.println("#  영수증 발급이 완료되었습니다. 안녕히 가세요.");
			System.out.println("#  프로그램이 종료되었습니다.");
			break;
		case "n":

			System.out.println("========================================");
			System.out.println("#  계산이 완료되었습니다. 안녕히 가세요.");
			System.out.println("#  프로그램이 종료되었습니다.");
			break;
		default:

			System.out.println("========================================");

			System.exit(0);
			break;
		}
	}

	
	public void paymentOnpoint() {

		System.out.println("========================================");
		System.out.printf("결제 금액 %d원\n", price);
		System.out.println("현재 소유하고 계신 포인트 : " + point);
		System.out.println("\n사용하실 포인트를 입력해주세요 : ");

		int pcash = scanner.nextInt();

		if (pcash > price) {

			System.out.println("========================================");
			System.out.println("포인트를 초과해서 지불했습니다.");
			System.out.println("결제창으로 다시 돌아갑니다.");
			ticketing();
		} else if (pcash == price) {

			System.out.println("========================================");
			System.out.printf("%d포인트를 사용하셨습니다.\n남은 포인트는 %d원 입니다.\n", pcash, point - pcash);
			System.out.println("즐거운 관람 되십시오.");

		} else {

			System.out.println("========================================");
			System.out.printf("%d원을 현금으로 더 지불하셔야 합니다.\n", price - pcash);
			System.out.println("\n현금 결제창으로 이동합니다.");
			dcash = price - pcash;
			differencePayment();

		}
	}

	public void differencePayment() {

		System.out.printf("지불하실 차액을 입력하세요 :  ");

		int difference = scanner.nextInt();

		if (difference < dcash) {

			System.out.println("========================================");
			System.out.println("금액이 부족하여 결제에 실패했습니다");
		} else if (difference > dcash) {

			System.out.println("========================================");
			System.out.printf("거스름돈은 %d원 입니다", difference - dcash);
			System.out.println("\n즐거운 관람되십시오.");

		} else {

			System.out.println("========================================");
			System.out.printf("즐거운 관람되십시오.");

		}
	}

}
