package 메소드;

public class Elevator {

	public static void main(String[] args) {
		// 변수 생성
		int a = 13;
		int b = 7;
		int c = 10;

		// 결과 출력
		System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
		System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
		System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
	}

	public static String guide(int i) {
		/* 메소드를 완성하시오. */
		

		if (i <= 10)
			return "저층 엘레베이터";
		else
			return "고층 엘레베이터";
		

	}

}
