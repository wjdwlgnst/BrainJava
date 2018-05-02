 class Circle {

	 public int radius;
	 public String name;
	 
	 public Circle() {//매개 변수를 가진 생성자
		 radius = 1;
		 name = "";
	 }
	 
	 //매개변수를 가진 생성자
	 public Circle (int r, String n) {
		 radius = r;
		 name = n;
	 }
	 
	 //메소드
	 public double getArea() {
		 return 3.14 * radius * radius;
	 }
	 
	 //메인 메소드
	 	 
	public static void main(String[] args) {
		
		Circle pizza = new Circle(10, "자바피자");
		double area = pizza.getArea();
		System.out.println(pizza.name +"의 면적은 " + area);
	}

}
