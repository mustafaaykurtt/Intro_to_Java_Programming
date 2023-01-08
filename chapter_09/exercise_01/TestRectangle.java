package chapter_09.exercise_01;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(40);
		rectangle.setHeight(4);
		
		System.out.println("Area: " + rectangle.getArea());
		System.out.println("Perimeter: " + rectangle.getPerimeter() + "\n");
		
		rectangle.setWidth(35.9);
		rectangle.setHeight(3.5);
		
		System.out.printf("Area: %.2f\n" , rectangle.getArea());
		System.out.printf("Perimeter: %.2f\n" , rectangle.getPerimeter());
		
	}
}
