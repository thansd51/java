package arrayList;

import java.util.ArrayList;

public class Iterating {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(7);
		list.add(9);
		list.add(123);
		
		for(Integer n : list) {
			System.out.println(n);
		}
		System.out.println();
		
		for(int i = 0; i < list.size(); i++){
			Integer n = list.get(i);
			
			System.out.println(i + ": " + n);
		}
		System.out.println();
		//람다식
		list.forEach(System.out::println);
		
		System.out.println();
		
		list.forEach(e->{System.out.println(e);});
	}

}
