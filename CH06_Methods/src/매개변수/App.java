package 매개변수;

public class App {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int number = 5;
		int result = calc.square(number);
		System.out.printf("%d의 제곱은 %d이다\n", number, result);
		
		result = calc.plus(10,10);
		System.out.printf("두 수의 합은 %d 이다 \n", result);
		System.out.printf("두 수의 합은 %d 이다 \n", calc.plus(45,9));
		
		result = calc.minus(10,100);
		System.out.printf("두 수의 차는 %d 이다 \n", result);

	}

}
