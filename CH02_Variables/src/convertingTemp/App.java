package convertingTemp;

public class App {

	public static void main(String[] args) {
		// 섭씨(Celsius 셀시우스) → 화씨(Fahrenheit퍼렌하이트) 변환 (0 °C × 9/5) + 32 = 32 °F

		double c = 25;
		double f = (c * 9/5) + 32;
		
		System.out.println("섭씨 "+c+"는 화씨 "+f+"이다.");
	}

}
