package application;

public class 리터럴과NEW {

	public static void main(String[] args) {
		// 리터럴 방식 vs new 키워드
		String new1 = new String("헬로우");
		String new2 = new String("헬로우");
		String literalStr1 = "헬로우";
		String literalStr2 = "헬로우";
		String newStr3 = literalStr1;
		System.out.println(new1);
		System.out.println(new2);
		System.out.println(literalStr1);
		System.out.println(literalStr2);
		System.out.println(newStr3);
		

	}

}
