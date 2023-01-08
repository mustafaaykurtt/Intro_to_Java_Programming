package chapter_09.exercise_10;

public class QuadricEquation {
	private double a;
	private double b;
	private double c;

	public QuadricEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getdicriminant() {
		return b * b - 4 * a * c;
	}

	public double getRoot1() {
		if (getdicriminant() > 0 || getdicriminant() == 0) {
			return (-b + Math.pow(getdicriminant(), 0.5)) / (2 * a);
		} else {
			return 0;
		}

	}

	public double getRoot2() {
		if (getdicriminant() > 0) {
			return (-b - Math.pow(getdicriminant(), 0.5)) / (2 * a);
		} else {
			return 0;
		}
	}
}
