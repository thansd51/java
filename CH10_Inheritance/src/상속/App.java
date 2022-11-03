package 상속;

public class App {

	public static void main(String[] args) {
		// 새는 동물을 상속받음
		Animal animal1 = new Animal();
		animal1.eat();
		
		
		//새는 본인 클래스 fly메소드 외의 상속받은 eat메소드
		Bird bird1 = new Bird();
		bird1.eat();
		bird1.fly();
	}

}
