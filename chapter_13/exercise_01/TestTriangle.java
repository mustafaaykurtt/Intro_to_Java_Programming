package chapter_13.exercise_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter side1,side2,side3: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.print("Enter the color: ");
		String color = input.next();
		
		System.out.print("Is filled? (true or false): ");
		Boolean filled = input.nextBoolean();
		input.close();
		
		try {
			
			GeometricObject triangle = new Triangle(side1, side2, side3, color, filled);
			System.out.println(triangle.toString());
			
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
