package integerVariables;

public class VariableAssignment {

	public static void main(String[] args) {
		// 변수는 값을 재할당 할 수 있다
		int dogs = 8;
		int cats = 3;
		
		System.out.println("1. Dogs " + dogs);
		System.out.println("1. Cats " + cats);
		
		dogs = cats;
		cats = 10;
		
		System.out.println("2. Dogs " + dogs);
		System.out.println("2. Cats " + cats);
	}		
}
