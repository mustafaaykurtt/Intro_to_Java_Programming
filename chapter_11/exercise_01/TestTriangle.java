package chapter_11.exercise_01;

public class TestTriangle {
	public static void main(String[] args) {
		GeometricObject x = new Triangle(3, 4, 3, "Black", true);
		Triangle triangle = (Triangle) x;
		
		System.out.printf("Triangle's area: %.3f ",triangle.getArea());
		System.out.println("\nTriangle's Perimeter: " + triangle.getPerimeter());
		System.out.println(triangle.toString());
	}
}
