package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_list {

	public static void main(String[] args) {
		ArrayList<Double> doubles = new ArrayList<Double>();
		
		doubles.add(7.38);
		doubles.add(3.88);
		doubles.add(1.45);
		doubles.add(2.35);
		doubles.add(9.28);
		
		Collections.sort(doubles);
		
		for(Double d : doubles) {
			System.out.println(d);
		}
		ArrayList<Person> people = new ArrayList<Person>();
		
		people.add(new Person("펭수"));
		people.add(new Person("길동"));
		people.add(new Person("라이언"));
		people.add(new Person("둘리"));
		
		Collections.sort(people);
		
		
		
		for(Person p : people) {
			System.out.println(p);
		}

	}

}
