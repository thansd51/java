package 실제예제;

import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		// 특정 타입(제네릭)을 검사해서(test) boolean 참,거짓으로 리턴한다.
		Predicate<String> p1 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.length() < 4;
			}
		};

		System.out.println(p1.test("abcd"));
		System.out.println(p1.test("하나둘"));

		Predicate<String> p2 = t -> t.length() < 4;

		System.out.println(p2.test("one"));
		System.out.println(p2.test("three"));
	}

}
