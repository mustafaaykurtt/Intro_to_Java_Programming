package chapter_13.exercise_01;

import java.util.InputMismatchException;

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	public Triangle() {
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle(double side1, double side2, double side3, String color, boolean isFilled) {
		this(side1, side2, side3);
		super.setColor(color);
		super.setFilled(isFilled);
	}

	@Override
	public double getArea() {
		if (!isTrue(side1, side2, side3)) {
			throw new InputMismatchException("The sum of 2 sides cannot be greater than the other side! Try again...");
		}
		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		return area;
	}

	private static boolean isTrue(double side1, double side2, double side3) {
		if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public String toString() {
		return "Triangle's color: " + getColor() + " is filled: " + isFilled() + " Area: " + getArea() + " Perimeter: " + getPerimeter();
	}

	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

}
