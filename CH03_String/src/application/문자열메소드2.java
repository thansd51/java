package application;

public class 문자열메소드2 {

	public static void main(String[] args) {
		// 문자열을 잘라내고 새로운 문자열 생성
        String Text = "apple";
        String newText = Text.substring(1);
        System.out.println(newText);
        newText = Text.substring(1,3);
        System.out.println(newText);
        
        String myText = "abcdefgh";
        System.out.println(myText.indexOf('c'));
	}

}
