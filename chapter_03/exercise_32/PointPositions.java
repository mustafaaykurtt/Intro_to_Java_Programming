package chapter_03.exercise_32;

import java.util.Scanner;

public class PointPositions {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter P0(x, y) P1(x, y) P2(x, y): ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double calculate = (x1 -x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		
		if (calculate > 0) {
			System.out.println("P2 is to the left of the line");
		}else if( calculate == 0) {
			System.out.println("P2 is above the line");
		}else {
			System.out.println("P2 is to the right of the line");
		}
	}
}
