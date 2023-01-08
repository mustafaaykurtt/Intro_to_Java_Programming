package chapter_11.exercise_01;

import java.util.Date;

public class GeometricObject {
	
	private String color;
	private boolean filled;
	private Date dateCreate;
	
	public GeometricObject() {
		color = "white";
		dateCreate = new Date();
	}
	
	public GeometricObject(String color, boolean filled) {
		this();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}
	
	@Override
	public String toString() {
		return "created on " + dateCreate + "\nColor: " + color + " and filled: " + filled;
	}
	
	//static metotları override edemiyoruz ornegi
	public static void foo() {
		
	}
	
}
