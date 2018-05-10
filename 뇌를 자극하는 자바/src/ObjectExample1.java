/**
 * 2018. 5. 2. Kim.S.C
   
   ObjectExample1.java
   
 */

/**
 * @author Administrator
 *
 */
public class ObjectExample1 {
	
	public static void main(String[] args) {
		
		
		StringBuffer obj = new StringBuffer("Hey, Java"); // 매개변수가 있는 생성자 호출
		obj.deleteCharAt(1); // 메소드 호출
		obj.deleteCharAt(1); // 메소드 호출
		obj.insert(1, 'i');  // 메소드 호출
		
		System.out.println(obj); // StringBuffer 객체를 넘겨줄 수도 있습니다.
		
		int length = obj.length();
		System.out.println("문자열" + obj + "의 길이는: " + length);
		
		
		// replace 메소드를 사용하여 Hey, Java -> Hello Java
		// replace는 바꾸고자 하는 범위의 숫자를 지정해 주고 바꾸고자 하는 단얼를 입력하면 된다.
		
		obj.replace(0,2,"Hello"); 
		System.out.println(obj);
		
	}

}
