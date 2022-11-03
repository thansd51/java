package toString;

public class Person {
	// 인스턴스변수에 직접 접근이 되면 안됨(get,set메소드이용)
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// 객체의 정보를 리턴

		return "이름 : " + name + ", 나이 : " + age;
	}

}
