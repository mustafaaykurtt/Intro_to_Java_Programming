package chapter_13.exercise_05;


public class Circle extends GeometricObject {

	private double radius;

	public Circle() {
		super(); // yazsak da yazmassakd a farkeden bir şey yok!
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	public double getDiameter() {
		return radius * 2;
	}

	@Override
	public String toString() {
		return "Circle's color: " + getColor() + " is filled: " + isFilled() + " Area: "
				+ String.format("%.3f", getArea()) + " Perimeter: " + String.format("%.3f", getPerimeter());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Circle))
			return false;
		Circle other = (Circle) obj;
		return Double.doubleToLongBits(radius) == Double.doubleToLongBits(other.radius)
				&& (getColor().equals(other.getColor()));

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
