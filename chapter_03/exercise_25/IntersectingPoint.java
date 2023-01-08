package chapter_03.exercise_25;

import java.util.Scanner;

public class IntersectingPoint {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1 x2 , x2 y2 , x3 y3 , x4 y4 : ");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		double b = (x1 - x2) * -1;
		double d = (x3 - x4) * -1;
		double a = y1 - y2;
		double c = y3 - y4;
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		
		
		double x0 = (e * d - b * f) / (a * d - b * c);
		double y0 = (a * f - e * c) / (a * d - b * c);
		
		if((a * d - b * c) != 0) {
			System.out.println("Intersection point (" + x0 + " , " + y0);
		}else {
			System.out.println("Two lines parallel to each other.");
		}
	
	}
}
		 					