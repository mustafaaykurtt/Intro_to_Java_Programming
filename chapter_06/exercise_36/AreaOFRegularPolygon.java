package chapter_06.exercise_36;

import java.util.Scanner;

public class AreaOFRegularPolygon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the hexagon side length: ");
		double side = input.nextDouble();
		System.out.println("Enter the hexagon side length:");
		int n = input.nextInt();
		
		double area = area(side , n);
		System.out.printf("%.3f ",area);
	}

	private static double area(double side, int n) {
		double area = (n * side * side) / (4 * Math.tan(Math.PI / n));
		return area;
	}
}
