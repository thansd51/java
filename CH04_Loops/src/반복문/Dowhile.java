package 반복문;

public class Dowhile {

	public static void main(String[] args) {
		// do while은 처음 한번은 조건과 상관없이 실행
		int count = 100;
		
		System.out.println("do while 반복문");
		
		do
		{
			System.out.printf("Count: %d", count);
		}
		while(count++ < 5);

	}

}
