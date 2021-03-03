package hw2;

public class Circle {

	private double radius;
	private double diameter;
	
	 
	
	Circle(double radius, double diameter){
		this.radius = radius;
		this.diameter = diameter;	
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public void setDiameter(double diameter) {
		this.diameter = diameter;
	};
			

	public double calcArea(){
		return 3.14 * diameter * diameter / 4;
	}
	
	public double calcLength() {
		return 2 * 3.14 * radius;
	}
	
}
