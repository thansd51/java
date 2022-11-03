package school;

public class Student {

	private String name;
	private int age;
	private boolean isVisible; // 집체 true , 원격 false
	private double temperature;

	public Student(String name, int age, boolean isVisible, double temperature) {

		this.name = name;
		this.age = age;
		this.isVisible = isVisible;
		this.temperature = temperature;
	}
	@Override
	public String toString() {
		
		return "Student [name=" + name + ", age=" + age + ", isVisible=" + isVisible + ", temperature=" + temperature + "]";
	}

}
