package 반복문;

public class 연산자위치 {

	public static void main(String[] args) {
		// 증감연산자의 위치에 따라 먼저 증감하고 할당(=), 할당(=)하고 증감
				int cats = 5;	
				System.out.println(cats++);
				System.out.println(cats);
				
				int dogs = 3;
				System.out.println(++dogs);
				
				int chickens = 10;
				
				int animals = cats + chickens++;
				
				System.out.println(animals);

				
				int apples = 5;
				int bananas = 4;
				
				int fruits = ++apples + bananas++;
				System.out.println(fruits);

	}
}
