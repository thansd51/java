package 예외던지기2;

public class App {

	public static void main(String[] args) {
		Thermostat stat = new Thermostat();
		try {
			stat.setTemperature(-5);
		} catch (Exception e) {
			
			//e.printStackTrace(); //예외 발생시 빨간색 오류 코드들
			System.out.println(e.getMessage());
		}

	}

}
