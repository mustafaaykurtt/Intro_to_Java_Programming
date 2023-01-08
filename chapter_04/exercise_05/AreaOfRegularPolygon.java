package chapter_04.exercise_05;

import java.util.Scanner;

public class AreaOfRegularPolygon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of side: ");
		int side = input.nextInt();
		System.out.println("Enter the side length: ");
		double distance = input.nextDouble();
		
		double area = (side * distance * distance) / (4 * Math.tan( Math.PI  / side));
		System.out.println(area);
		
		
		
	}
}
