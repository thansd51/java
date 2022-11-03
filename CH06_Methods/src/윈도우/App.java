package 윈도우;

public class App {
	public static void main(String[] args) {
		Window window = new Window();
		window.setWidth(300);
		window.setHeight(300);
		window.setLeft(100);
		window.setTop(50);
		window.isVisible();
		
		System.out.println(window.getWidth());
		System.out.println(window.getHeight());
		System.out.println(window.getLeft());
		System.out.println(window.getTop());
		System.out.println(window.isVisible());
	
		
	}

}
