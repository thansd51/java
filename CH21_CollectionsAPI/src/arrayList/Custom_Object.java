package arrayList;

import java.util.ArrayList;

public class Custom_Object {

	public static void main(String[] args) {
		// 클래스 타입 Person을 리스트에 추가
		ArrayList<Person> people = new ArrayList<Person>();

		people.add(new Person("펭수"));
		people.add(new Person("길동"));
		people.add(new Person("라이언"));
		people.add(new Person("둘리"));
		
		people.forEach(p -> System.out.println(p));
		System.out.println();
		for(Person p : people) {
			System.out.println(p.toString());
		}
		System.out.println();
		people.set(1, new Person("마이클"));
		
		for(Person p : people) {
			System.out.println(p.toString());
		}
	}

}
