 class Circle {

	 public int radius;
	 public String name;
	 
	 // 매개변수 없는 생성자
	 public Circle() {
		 radius = 1;
		 name = "";
	 }
	 
	 // 매개변수를 가진 생성자
	 public Circle (int r, String n) {
		 radius = r;
		 name = n;
	 }
	 
	 // 메소드
	 public double getArea() {
		 return 3.14 * radius * radius;
	 }
	 
	 // 메인 메소드
	 	 
	public static void main(String[] args) {
		
		Circle pizza = new Circle(10, "자바피자");
		double pizza_area = pizza.getArea();
		System.out.println(pizza.name +"의 면적은 " + pizza_area);
		
		/*
		Circle dount = new Circle(); // 매개변수 없는 생성자
		dount.radius = 2;
		dount.name = "자바도넛";
		
		double dount_area = dount.getArea();
		System.out.println(dount.name + "의 면적은 " + dount_area);
		System.out.println(pizza.name + "의 면적은 " + pizza_area);
		*/
	}

}
