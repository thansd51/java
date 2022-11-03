package 조건문;

import java.util.Scanner;

public class 변수범위 {

	public static void main(String[] args) {
		// 변수의 범위는 코드블록{} 으로 결정
		{
			int value = 0;
			System.out.println(value);
		}
		
		for (int i = 0; i < 4; i++) {
			// for문 안에 쓰인 변수 i
			System.out.println(i);
		}
		
		Scanner scanner = new Scanner(System.in);
		
		String input = null;
		
		do {
			System.out.println("종료할려면 'quit'를 입력하세요");
			input = scanner.nextLine();
		} while(!input.equals("quit"));
		
		scanner.close();
	}

}
