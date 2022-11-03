package 실제예제;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.UnaryOperator;

public class ReplaceAll {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(7);
		numbers.add(3);

//		numbers.replaceAll(new UnaryOperator<Integer>() {
//			
//			@Override
//			public Integer apply(Integer t) {
//				return t * t; //원래 숫자의 제곱으로 리턴
//			}
//		});

		numbers.replaceAll(t -> t * t);

		numbers.forEach(t -> System.out.println(t));

		List<String> friends = new ArrayList<String>();
		friends.add("펭수");
		friends.add("길동");
		friends.add("메리");
		friends.add("철수");

		friends.replaceAll(s -> "안녕~ " + s);

		friends.forEach(t -> System.out.println(t));
	}

}
