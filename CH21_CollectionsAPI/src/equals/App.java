package equals;

import java.util.Scanner;

class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false; //클래스가 다를경우 false
		Person other = (Person) obj;
		if (other.name == null) 
			return false;
		
		return this.name.equals(other.name);
	}
}

public class App{
	public static void main(String[] args) {
		Person p1 = new Person("펭수");
		Person p2 = new Person("펭수");
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		//문자열 비교시 equals 사용
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("입력 : ");
//		String input = scanner.nextLine();
//		
//		if(input.equals("y")) {
//			System.out.println("예스");
//		}
		
	}
}
