package arrayList;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		//가장 많이 쓰는 자료 컬렉션 타입
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(7);
		list.add(9);
		list.add(123);
	
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	
	}

}
