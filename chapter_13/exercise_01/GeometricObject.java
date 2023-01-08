package chapter_13.exercise_01;

public abstract class GeometricObject {
	private String color;
	private boolean isFilled;

	public GeometricObject() {
		this("White", true);
	}

	public GeometricObject(String color, boolean isFilled) {
		this.color = color;
		this.isFilled = isFilled;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	@Override
	public String toString() {
		return "Triangle's color: " + getColor() + " is filled: " + isFilled() + " Area: " + getArea() + " Perimeter: " + getPerimeter();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
}
