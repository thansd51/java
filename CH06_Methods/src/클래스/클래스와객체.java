package 클래스;

//한 파일에 여러개의 클래스 생성 가능
class Person{
	String name;
}

public class 클래스와객체 {

	public static void main(String[] args) {
		// 클래스 설계도로 실제 사용가능한 객체를 생성(메모리에 생성)
		Person p1 = new Person();
		p1.name = "펭수";

		Person p2 = new Person();
		p2.name = "길동";

		System.out.println(p1.name);
		System.out.println(p2.name);

	}

}
