package chapter_03.exercise_34;

import java.util.Scanner;

public class PointOnLineSegment {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter P0(x, y) P1(x, y) P2(x, y): ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		
		boolean online = 
				 !(((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0 ||
				 ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) < 0 ||
				 (x2 < x0) || (y2 < y0) || (x2 > x1) || (y2 > y1));
				 
				 
				 // Display result
				 System.out.print("(" + x2 + ", " + y2 + ") , ");
				 if (!online) {
				 System.out.print(" not betweet ");}
				 System.out.println(" between (" + x0 + ", " + y0 + 
				 ") to (" + x1 + ", " + y1 + ")");
	}
}
