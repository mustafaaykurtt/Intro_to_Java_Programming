package chapter_13.exercise_07;

public class Square extends GeometricObject implements Colorable{
	private double side;
	
	public Square () {
		this(1);
	}
	
	public Square (double side) {
		this.side = side;
	}
	
	@Override
	public void howToColor() {
		System.out.println("Color all four sides");
	}

	@Override
	public double getArea() {
		return getSide() * getSide();
	}

	@Override
	public double getPerimeter() {
		return 4 * getSide();
	}

	@Override
	public String toString() {
		return super.toString() + "\nSide: " + side + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	
}
