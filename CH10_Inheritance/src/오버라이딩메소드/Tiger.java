package 오버라이딩메소드;

public class Tiger extends Cat{

	@Override
	public void vocal() {
		System.out.println("어흥~");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "호랑이";
	}

}
