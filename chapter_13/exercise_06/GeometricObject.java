package chapter_13.exercise_06;

public abstract class GeometricObject {
	private String color;
	private boolean isFilled;

	protected GeometricObject() {
		this("White", true);
	}

	protected GeometricObject(String color, boolean isFilled) {
		this.color = color;
		this.isFilled = isFilled;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	@Override
	public abstract String toString() ;
	

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
