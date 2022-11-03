package application;

import java.util.Scanner;

//행맨 게임을 실행하는 클래스

public class Hangman {

	private boolean running = true;
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	private int remainTries = 7;
	

	public void run() {
		do {
			displayWord(); // 화면에 단어표시
			getUserInput(); // 입력받음
			checkUserInput(); // 맞는지 체크 > 맞을시 running=false
		} while (running);
	}

	public void displayWord() {
		// 단어표시

		System.out.println(word.toString()); // 랜덤으로 선택된 단어
	}

	public void getUserInput() {
		System.out.println("한 문자 입력 : ");
		String guess = scanner.nextLine();
		// 문자열에서 빼낸 한 문자를 RandomWord 메소드로 보낸다.
		word.addGuess(guess.charAt(0));
		
	}

	public void checkUserInput() {
		if (word.isCompleted()) {
			System.out.println("승리했습니다!");
			System.out.println("정답은 : " + word);
			running = false;
		} else {
			
			remainTries--;
			System.out.println("시도횟수 : "+remainTries);
			
			if (remainTries == 0) {
				System.out.println("Game Over!");
				running = false;
			}
		}
	}

	public void close() {
		// 게임 종료시 스캐너 닫기
		scanner.close();

	}

}
