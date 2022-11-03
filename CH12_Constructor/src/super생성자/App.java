package super생성자;

public class App {

	public static void main(String[] args) {
		
		//아무런 생성자가 없을 때는 기본생성자 자동 사용 가능 그러나 생성자가 있으면 있는 것을 사용
		
		Employee emp1 = new Employee();
		System.out.println(emp1);
	}

}
