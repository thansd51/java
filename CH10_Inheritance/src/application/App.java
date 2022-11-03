package application;

import entities.Apple;
import entities.Banana;
import entities.Fruit;

public class App {

	public static void main(String[] args) {
		Fruit fruit1 = new Apple();
		//f1.id = 10; 패키지가 다르고 App이 자식 클래스가 아님
		System.out.println(fruit1);
		
		Fruit fruit2 = new Banana();
		System.out.println(fruit2);
	}

}
