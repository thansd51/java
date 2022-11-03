package 리턴;

interface Joiner{
	String join(String text1, String text2);
}

public class App {

	public static void main(String[] args) {
		
		Joiner joiner = (s1, s2) -> {
			String text = s1 + " - " + s2;
			return text;
		};
		
		System.out.println(joiner.join("치킨", "맥주"));
		System.out.println(joiner.join("학원", "공부"));
		
		//한줄이라서 생략 시 리턴도 같이 생략한다.
		Joiner joiner2 = (s1, s2) -> s1 + " + " + s2;
		
		System.out.println(joiner2.join("치킨", "맥주"));
		System.out.println(joiner2.join("학원", "공부"));
		
	}

}
