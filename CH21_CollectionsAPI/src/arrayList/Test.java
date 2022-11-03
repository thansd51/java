package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Double> numbers = new ArrayList<Double>();
		
		
		System.out.println("숫자 또는 'Q' 입력 > ");
		String input = scanner.nextLine();
		input = input.trim(); //공백삭제
		
		
		
		double value = Double.parseDouble(input); //실수로 변환
		numbers.add(value);
		
		System.out.println("실수를 입력하세요");
	
		
		
		
		
			
			for(Double number : numbers) {
			System.out.printf("%.2f\n", number);
			}
		
		
			System.out.println("입력된 숫자 : ");
		
		
		
		System.out.println();
		scanner.close();
		
		
		
		
		
		
		
		}
	
	}
	

