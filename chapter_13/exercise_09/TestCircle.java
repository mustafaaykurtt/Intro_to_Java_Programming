package chapter_13.exercise_09;

public class TestCircle {
	public static void main(String[] args) {
		Circle circle = new Circle(12);
		Circle circle1 = new Circle(12);
		
		System.out.println("Circle compare circle1: "  + circle.compareTo(circle1));
		System.out.println("Equals? : "  + circle.equals(circle1));
	}
}
