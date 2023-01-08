package chapter_09.exercise_01;

public class Rectangle {

	private double width;
	private double height;

	public Rectangle() {
		this(1, 1);
	}
	
	public Rectangle(double width , double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return (width + height) * 2; 
	}
	
	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
