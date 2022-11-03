package super생성자;

public class Employee extends Person{
	public Employee() {
		super("익명"); //부모클래스의 객체가 먼저 생성됨
		System.out.println("Employee 생성자!");
	}
}
