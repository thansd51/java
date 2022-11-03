package custom_exception;

import custom_exception.exceptions.TempTooHighException;
import custom_exception.exceptions.TempTooLowException;

public class App {

	public static void main(String[] args) {

		Thermostat stat = new Thermostat();
		try {
			stat.setTemperature(-5);
		} catch (TempTooLowException e) {
			System.out.println("온도가 0도 미만입니다.");
		} catch (TempTooHighException e) {
			System.out.println("온도가 35도 초과입니다.");
		}

	}

}
