package chapter_06.exercise_35;

import java.util.Scanner;

public class AreaOfPentagon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of sides:");
		int side = input.nextInt();
		System.out.println("Enter side length:");
		double length = input.nextDouble();
		
		double area = area(side , length);
		System.out.println(area);
	}

	private static double area(int side, double length) {
		double area = (side * length * length) / (4 * Math.tan( Math.PI  / side));
		return area;
	}
}
