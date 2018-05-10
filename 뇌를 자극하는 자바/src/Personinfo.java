/**
 * 2018. 5. 3. Kim.S.C
   
   Personinfo.java
   
 */

/**
 * @author Administrator
 *
 */
public class Personinfo {
	
	public static void main(String[] args) {
		
		// 클래스 변수
		Person person;
		// 매개변수 없는 디폴트 생성자 호출하여 객체생성
		//person = new Person();
			
		// String 매개변수 1개있는 생성자 호출하여 객체생성
		//person = new Person("홍길동");
		
		// String 매개변수 int 매개변수 있는 생성자 호출하여 객체생성
		//person = new Person("홍길동", 20);
		
		// int 매개변수 있고  String 매개변수 있는 생성자 호출하여 객채생성
		person = new Person(20, "홍길동");	
		
		//매소드 호출
		person.showPerson();
		System.out.println(person);
	}

}
