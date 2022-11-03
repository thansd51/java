package application;

import java.util.Random;

//랜덤 단어 생성 클래스

public class RandomWord {

	private String books = "depression management advertising initiative apartment addition inspector passenger operation secretary confusion resolution replacement president celebration opportunity personality transportation candidate computer solution indication patience painting competition interaction criticism committee inflation language";
	private String[] words = books.split(" "); // 스페이스로 단어들을 분리해서 배열
	private Random random = new Random();
	private String selectWord;
	private char[] characters;
	

	//생성자로 생성시 단어가 선택됨
	public RandomWord() {
		selectWord = words[random.nextInt(words.length)];
		characters = new char[selectWord.length()];
	}
	//단어 배열 words에 있는 모든 단어 출력
	public void getWords() {
		for(String word : words) {
			System.out.println(word);
		}
	}
	//선택된 한개의 단어 출력
	public String toString() {
		String text = "";
		//철자를 맞췄을 때
		//characters[3] = 'X';
		
		for(char c : characters) {
//			if(c=='\u0000')/*처음 상태 공백, 문자의 null값*/ {
//				text += '_';
//			}
//			else { // 문자를 맞췄을 때
//				text += c;
//			}
			//삼항 연산자
			text += (c=='\u0000') ? '_' : c;
			text += ' ';
			
		}
//		System.out.println(selectWord); //임시로 단어를 보여줌
		return text;
	}
	/* 입력된 문자와 같은 문자가 있는지 확인 */
	public boolean addGuess(char c) {
		// 선택된 문자열 전체를 확인해서 문자배열 characters에 입력
		for(int i=0; i < selectWord.length(); i++) {
			if(c == selectWord.charAt(i)) {
				characters[i] = c;
				return true;
			}
		}
		return false;
	}
	public boolean isCompleted() {
		// 만약에 전체 character에서 공백이 없으면 종료
		for(char c: characters) {
			if(c == '\u0000') {
				return false;
			}
		}
		//공백이 하나도 없으면 내려옴
		return true; 
	}
}
