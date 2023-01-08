package chapter_03.exercise_01;

import java.util.Scanner;

public class SolveQuadraticEquations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a, b ,c ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double discriminant = (b * b - 4 * a * c);
		double r1;
		double r2;

		if (discriminant == 0) {
			r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);

			System.out.println("The equation has a root : " + r1);

		}else if (discriminant > 0) {
			r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
			r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
			System.out.println("The equation has two roots : " + r1 + "ve" + r2);

		} else {
			System.out.println("There aren't roots.");
		}

	}

}
