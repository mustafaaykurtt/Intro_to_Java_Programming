package chapter_13.exercise_12;

public abstract class GeometricObject implements Comparable<GeometricObject> {
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
	
	@Override // Implement
	public int compareTo(GeometricObject o) {
		if (this.getArea() > o.getArea()) {
			return 1;
		} else if (this.getArea() < o.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
		return o1.compareTo(o2) == 1 ? o1 : o2;
	}
	
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
