package getterSetter;

public class Person {
	// 인스턴스변수에 직접 접근이 되면 안됨(get,set메소드이용)
	private String name;
	private int age;

	// 셋 메소드는 필드변수의 값에 입력받은 값을 넣어준다.
	void setName(String name) {
		this.name = name;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

}
