package chapter_13.exercise_11;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	private double side;

	public Octagon(double side) {
		this.side = side;
	}

	public Octagon(double side, String color, boolean isFilled) {
		this(side);
		setColor(color);
		setFilled(isFilled);
	}

	@Override
	public double getArea() {
		return (2 + 4 / Math.pow(2, 0.5)) * getSide() * getSide();
	}

	@Override
	public double getPerimeter() {
		return 8 * getSide();
	}
	
	@Override
	public int compareTo(Octagon o) {
		if (this.getArea() > o.getArea()) {
			return 1;
		} else if (this.getArea() < o.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Octagon's area: " + String.format("%.3f", getArea()) + " Perimeter: " + String.format("%.3f", getPerimeter()) + " " + super.toString();
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	

}
