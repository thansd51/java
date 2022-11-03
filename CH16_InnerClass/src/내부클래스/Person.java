package 내부클래스;

public class Person {
	class Head{
		public void print() {
			System.out.println("헤드");
		}
	}
	
	static class Body{
		public void print() {
			System.out.println("바디");
		}
	}
	
	public void print() {
		Head head = new Head();
		Body body = new Body();
		
		head.print();
		body.print();
	}

}
