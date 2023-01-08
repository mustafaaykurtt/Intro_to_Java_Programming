package chapter_13.exercise_05;

public class TestGeometricObject {
	public static void main(String[] args) {
		GeometricObject circle1 = new Circle(12, "blue", true);
		GeometricObject circle2 = new Circle(8, "blue", false);
		
		System.out.println(circle1.compareTo(circle2));
		System.out.println(GeometricObject.max(circle1, circle2));
		
		Rectangle rectangle1 = new Rectangle(4, 5, "green", true);
		Rectangle rectangle2 = new Rectangle(4.2, 5, "orange", true);
		
		System.out.println(rectangle1.compareTo(rectangle2));
		System.out.println(Rectangle.max(rectangle1, rectangle2));
	}
}
