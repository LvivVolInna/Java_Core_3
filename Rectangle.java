package hw2;

public class Rectangle {

	private int length;
	private int width;
	
	
	Rectangle(){
	};
	
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;	
	}


	public void setLength(int length) {
		this.length = length;
	}


	public void setWidth(int width) {
		this.width = width;
	};
			

	public int calcArea(){
		return length * width;
	}
	
	public int calcPerimeter() {
		return 2*(length + width);
	}
	
	
}
