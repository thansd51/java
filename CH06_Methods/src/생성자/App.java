package 생성자;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person("펭수", 120.0);
		Person p2 = new Person("길동", 170.0);
		Person p3 = new Person("라이언", 180.0);
		
		
//		p1.setName("펭수");
//		p1.setHeight(120.0);
//		p2.setName("길동");
//		p2.setHeight(172.5);
//		p3.setName("라이언");
//		p3.setHeight(165.5);
		
		System.out.println(p1.getName());
		System.out.println(p1.getHeight());
		
		System.out.println(p2.getName());
		System.out.println(p2.getHeight());
		System.out.println(p3.getName());
		System.out.println(p3.getHeight());

		
		
		
		Person p4 = new Person();
		
		System.out.println(p4.getName());
	}

}
