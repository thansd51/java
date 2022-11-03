package 다향성;
//모든 클래스는 오브젝트클래스 상속
public class Cat {
	public void vocal() {
		System.out.println("야옹~");
	}
	public void hunt() {
		System.out.println("사냥중!");
	}
	@Override
	public String toString() {
		// Object클래스의 toString을 오버라이드
		return "고양이";
	}
}
