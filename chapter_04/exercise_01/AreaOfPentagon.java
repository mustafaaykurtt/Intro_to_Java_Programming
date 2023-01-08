package chapter_04.exercise_01;

import java.util.Scanner;

public class AreaOfPentagon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side length : ");
		double side = input.nextDouble();
		final double PI = Math.PI;
		
		double s = 2 * side * Math.sin((PI) / 5);
		
		System.out.println(s);
		double area = (((5 * s * s) / (4 * Math.tan(PI / 5))));
		
		System.out.println(area);
	}
}
