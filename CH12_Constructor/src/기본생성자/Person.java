package 기본생성자;

public class Person {
	
	private String name;
	
	
	public Person() {
		
	}
	
	public Person(String name) {
		System.out.println("person이 생성됨");
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}	
}
