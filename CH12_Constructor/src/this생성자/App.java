package this생성자;

public class App {

	public static void main(String[] args) {
		
		//아무런 생성자가 없을 때는 기본생성자 자동 사용 가능 그러나 생성자가 있으면 있는 것을 사용
		
		Person person1 = new Person();
		Person person2 = new Person("펭");		
		Person person3 = new Person("펭수", 21);
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
	}

}
