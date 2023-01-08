package chapter_09.exercise_09;

public class RegularPolygon {
	private int n;
	private double side;
	private double x;
	private double y;
	
	public RegularPolygon() {
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	
	public RegularPolygon(int n , double side) {
		this.n = n;
		this.side = side;
		x = 0;
		y = 0;
	}
	
	public RegularPolygon(int n, double side , double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	public double getPerimeter() {
		return 3 * side;
	}
	
	public double getArea() {
		return (n * side * side) / (4 * Math.tan( Math.PI  / n));
	}
}
