package application;

public class 빈문자열 {

	public static void main(String[] args) {
		// blank vs empty : 공백을 제외할려면 blank를 사용
		String myText = " ";
		System.out.println("빈문자열 확인: " + myText.isEmpty()); // 빈문자열만 확인
		System.out.println("빈문자열 확인: " + myText.isBlank()); //공백 제외화고 빈문자열 확인
		
        //문자열 replace A > B
		myText = "아침밥을 맛있게 먹었다.";
		System.out.println(myText.replace("아침", "저녁"));
		
		//공백 제거
		String name = "  제인 ";
		System.out.printf("'%s'", name.strip());
	}

}
