package application;

public class Cat {
	// 스태틱 상수는 final 앞에 static이 붙음, 객체 생성 없이 사용
	private String name;
	private int id;
	public static final String FOOD = "고양이 사료";
	// 스태틱 변수는 공유해서 값을 사용 가능, 스태틱 변수 초기값 0
	private static int count = 0;

	public Cat(String name) {
		this.name = name;
		count++;
		id = count;
	}
	
	
	public int getId() {
		return id;
	}


	//스태틱 메소드는 인스턴스 변수를 사용할 수 없다.
	//스태틱 변수는 사용 가능
	public static int getCount() {
		return count;
	}
		
		
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
	return String.format("고양이ID: %d, 이름: %s", id, name);
	}
}
