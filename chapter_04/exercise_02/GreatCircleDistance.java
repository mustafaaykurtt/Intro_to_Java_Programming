package chapter_04.exercise_02;

import java.util.Scanner;

public class GreatCircleDistance {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		final double R = 6371.01;
		System.out.println("Enter the latitude and longitude of the 1st and 2nd point.: ");
		double a1 = input.nextDouble();
		double b1 = input.nextDouble();
		double a2 = input.nextDouble();
		double b2 = input.nextDouble();

		double x1 = Math.toRadians(a1);
		double y1 = Math.toRadians(b1);
		double x2 = Math.toRadians(a2);
		double y2 = Math.toRadians(b2);

		double distance = R * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		System.out.println("Distance = " + distance);

	}
}
