package 파일클래스;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		File currentDirectory = new File(".");
		
		System.out.println(currentDirectory.getAbsolutePath());
		System.out.println(currentDirectory.getCanonicalPath());

	}

}
