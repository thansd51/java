package 한줄씩쓰기;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App2 {

	public static void main(String[] args) {
		String fileLocation = "C:\\Java\\workspace\\CH19_Reading_Writing\\text.txt";
		//try=with-resources문 파일을 자동을 닫음
		try(BufferedWriter br = new BufferedWriter(new FileWriter(fileLocation))) {
			
			br.write("오렌지2");
			br.newLine();
			br.write("apple2");
			br.newLine();
			br.write("banana2");
			br.newLine();
			br.write("배2");
			br.newLine();
			
		} catch (IOException e) {
			// 파일을 쓸 때 파일이 없으면 새로 만듬
			System.out.println("파일을 쓸수 없음 : "+ fileLocation);
		}
		System.out.println("파일 쓰기 완료 : "+ fileLocation);

	}

}
