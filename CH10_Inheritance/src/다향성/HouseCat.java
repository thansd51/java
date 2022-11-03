package 다향성;

public class HouseCat extends Cat {
	@Override
	public void vocal() {
		System.out.println("미야우~");
	}
	@Override
	public String toString() {
		// Object클래스의 toString을 오버라이드
		return "집고양이";
	}
	public void callMaster() {
		System.out.println("집사 부르기");;
	}
}
