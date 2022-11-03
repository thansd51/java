package 런타임에러;

public class Thermostat {

	// throws 예외는 예외를 미뤄서 이 메소드를 부를 때 처리
	public void setTemperature(double temperature) {

		setMachineTemperature(temperature);

		System.out.println("온도 세팅 : " + temperature);
	}

	private void setMachineTemperature(double temperature) {
		if (temperature < 0 || temperature > 35) {
			throw new RuntimeException("온도가 비정상 입니다.");
		}
	}

}
