package hw2;

public class App1 {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		r1.setLength(18);
		r1.setWidth(6);
		
		
		Rectangle r2 = new Rectangle(35, 14);
		
		
		Circle c = new Circle(15.2, 30.4);
	
	
		
		System.out.println("Площа прямокутника r1 = " + r1.calcArea() + ", Периметр прямокутника r1 = " + r1.calcPerimeter());
		System.out.println("Площа прямокутника r2 = " + r2.calcArea() + ", Периметр прямокутника r2 = " + r2.calcPerimeter());
		System.out.println("Площа кола с = " + c.calcArea() + ", Довжина кола с = " + c.calcLength());

	}

}
