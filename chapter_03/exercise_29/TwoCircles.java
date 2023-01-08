package chapter_03.exercise_29;

import java.util.Scanner;

public class TwoCircles {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the x,y coordinate and radius of the circle1.");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();
		
		System.out.println("Enter the x,y coordinate and radius of the circle2.");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();
		
		double d =  Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5);
		
		double a = r1 - r2;
		
		a = a < 0 ? a * -1 : a;
		
		if ( d <= a) {
				System.out.println("circle2 is inside circle1");
		}
		else if (d <= (r1 + r2)) {
			System.out.println("circle2 intersects circle1");
		}else {
			System.out.println("circle2 does not intersect with circle1.");
		}
		
		
	}
}
