public class Person {

	String name;
	int age;
	
	// 생성자
	public Person() {
		
	}
	
	// 매개변수 있는 생성자
	public Person(String name) {
		this.name =name;
	}
	
	// 매개변수 2개 있는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(String name, int age) 매개변수 2개 있는 생성자");
	}
	
	// 매개변수 2개(int, String)있는 생성자
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("Person(String name, int age) 매개변수 2개 있는 생성자");
	}

	public void showPerson() {
		System.out.println("이름:" + name + "나이:" + age);
	}
}
