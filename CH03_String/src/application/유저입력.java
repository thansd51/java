package application;

import java.util.Scanner;

public class 유저입력 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("온도를 입력해 주세요 : ");
		
		double c = scanner.nextFloat();	
		double f = (c * 9 / 5) + 32;

		//System.out.println("섭씨 " + c + "는 화씨 " + f + "이다.");
		System.out.printf("섭씨 %.1f 는 화씨 %.1f이다.", c, f);
		
		scanner.close(); //입력받는 스캐너 객체를 종료
	}
}
