 class Circle {

	 public int radius;
	 public String name;
	 
	 public Circle() {//�Ű� ������ ���� ������
		 radius = 1;
		 name = "";
	 }
	 
	 //�Ű������� ���� ������
	 public Circle (int r, String n) {
		 radius = r;
		 name = n;
	 }
	 
	 //�޼ҵ�
	 public double getArea() {
		 return 3.14 * radius * radius;
	 }
	 
	 //���� �޼ҵ�
	 	 
	public static void main(String[] args) {
		
		Circle pizza = new Circle(10, "�ڹ�����");
		double area = pizza.getArea();
		System.out.println(pizza.name +"�� ������ " + area);
	}

}
