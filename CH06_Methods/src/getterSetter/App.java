package getterSetter;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("펭수");
		p1.setAge(7);
		
		Person p2 = new Person();
		p2.setName("길동");
		p2.setAge(8);
		
		
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		

	}

}
