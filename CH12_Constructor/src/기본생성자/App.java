package 기본생성자;

public class App {

	public static void main(String[] args) {
		
		//아무런 생성자가 없을 때는 기본생성자 자동 사용 가능 그러나 생성자가 있으면 있는 것을 사용
		Person person = new Person("펭수");
		Person person1 = new Person();
		System.out.println(person);
		System.out.println(person1);
	}

}
