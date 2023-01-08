package chapter_13.exercise_09;


public class Circle extends GeometricObject implements Comparable<Circle> {

	private double radius;

	public Circle() {
		super(); 
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}
	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	public double getDiameter() {
		return radius * 2;
	}
	
	@Override
	public int compareTo(Circle o) {
		if (this.radius > o.radius) {
			return 1;
		} else if (this.radius < o.radius) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Circle))
			return false;
		return this.compareTo((Circle)obj) == 0;
	}
	
	@Override
	public String toString() {
		return "Circle's color: " + getColor() + " is filled: " + isFilled() + " Area: "
				+ String.format("%.3f", getArea()) + " Perimeter: " + String.format("%.3f", getPerimeter());
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	
}
