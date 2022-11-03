package 런타임에러;

public class App {

	public static void main(String[] args) {
		//런타임 예외는 처리를 안해도 에러가 발생하지 않음
//		try {
//			System.out.println(5/0);
//		}catch(ArithmeticException e) {
//			System.out.println("d");
//		}
	
		
		Thermostat stat = new Thermostat();
		try {
			stat.setTemperature(-5);
		} catch (Exception e) {
			
			//e.printStackTrace(); //예외 발생시 빨간색 오류 코드들
			System.out.println(e.getMessage());
		}

	}

}
