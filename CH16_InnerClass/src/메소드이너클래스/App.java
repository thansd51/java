package 메소드이너클래스;

public class App {

	private String name;
	
	public App(){
		name = "엘리자베스";
	}
	public static void main(String[] args) {
		App app = new App();
		app.run();
	}

	private void run() {
		class Printer{
			public void print() {
				System.out.println(name);
			}
		}
		new Printer().print();
	}
}
