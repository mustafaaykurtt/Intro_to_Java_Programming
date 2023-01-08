package chapter_09.exercise_08;

public class Fan {
	private final static int FAST = 3;
	private final static int MEDIUM = 2;
	private final static int SLOW = 1;
	private int speed;
	private boolean on;
	private int radius;
	private String color;

	public Fan() {
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}

	public String toString() {
		if (on) {
			return "Speed:" + getSpeed() + " Radius:" + getRadius() + " Color:" + getColor();
		} else {
			return "Speed:" + getSpeed() + " Color:" + getColor() + " Radius:" + getRadius() + " Fan is off!";
		}
	}

	public void turnOn() {
		on = true;
	}

	public String getSpeed() {
		String s = "";
		switch (speed) {
			case SLOW: s = "SLOW"; break;
			case MEDIUM: s = "MEDIUM"; break;
			case FAST: s = "FAST";
		}
		
		return s;
	}

	public int getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public void turnOff() {
		on = false;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
