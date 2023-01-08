package chapter_13.exercise_12;

import java.util.ArrayList;

public class TestGeometricObject {
	public static void main(String[] args) {
		ArrayList<GeometricObject> object = new ArrayList<>();
		object.add(new Circle(12));
		object.add(new Circle(12));
		object.add(new Rectangle(12, 10));
		object.add(new Rectangle(13, 32));
		
		double sumArea = 0;
		for (int i = 0; i < object.size(); i++) {
			sumArea += object.get(i).getArea();
		}
		
		System.out.printf("Total area: %.3f", sumArea);
	}
}
