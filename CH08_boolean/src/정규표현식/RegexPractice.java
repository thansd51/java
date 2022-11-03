package 정규표현식;

import java.util.regex.Pattern;

public class RegexPractice {

	public static void main(String[] args) {
		System.out.println("Cat".matches("cat"));
		System.out.println("Cat".toLowerCase().matches("cat"));
		System.out.println("cat".matches("[Cc]at"));
		System.out.println("Cat".matches("[a-dA-D]at"));
		System.out.println("Cat".matches("[^c]at"));
		System.out.println("Cat".matches("[^c]at"));
		// \w > 한개의 문자또는 숫자 > 문자열 "\\w"
		System.out.println("ABC".matches("\\w\\w\\w"));
		//횟수 n개 이상
		System.out.println("ABC".matches("\\w{3}"));
		//전화번호(02|010|051)-\\d{3,4}-\\d{4}
		System.out.println("010-1234-5678".matches("(02|010|051)-\\d{3,4}-\\d{4}"));
		
		String regex = "(02|010|051)-\\d{3,4}-\\d{4}";
		String phonenumber = "010-1234-5678";
		
		boolean result = Pattern.matches(regex, phonenumber);
		
		if(result) {
			System.out.println("올바른 전화번호 형식입니다.");
		}
		else{
			System.out.println("올바르지 않은 전화번호 형식입니다.");
		}
		regex = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String email = "angel@naver.com";
		result = Pattern.matches(regex, email );
		if(result) {
			System.out.println("정규식과 일치합니다. 올바른 이메일 형식입니다");
		} else {
			System.out.println("정규식과 일치하지 않습니다. 올바른 이메일 형식이 아닙니다");
		}
	
	}
}
