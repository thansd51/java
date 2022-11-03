package hashset;

import java.util.LinkedHashSet;

public class LinkedHash {
    //순서대로 출력, 중복 안됨
	public static void main(String[] args) {
		LinkedHashSet<String> fruits = new LinkedHashSet<String>();

		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("사과");

		for (String f : fruits) {
			System.out.println(f);
		}

	}

}
