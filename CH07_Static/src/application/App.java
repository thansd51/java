package application;

public class App {
	public static void main(String[] args) {
		//스태틱(클래스) 상수는 객체 클래스.상수

		
		
		
		System.out.println("고양이 숫자: " + Cat.getCount());
		

		Cat cat1 = new Cat("마틸다");
		
		Cat cat2 = new Cat("라이언");
		
		Cat cat3 = new Cat("울버린");
	
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		System.out.println(Cat.FOOD);
		System.out.println(Math.PI);
		System.out.println("고양이 숫자: " + Cat.getCount());
		
		App app = new App();
		sayHi();
	}
	
	private static void sayHi() {
		System.out.println("hi");
		
	}

	
}
