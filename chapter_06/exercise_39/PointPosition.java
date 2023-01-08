package chapter_06.exercise_39;

import java.util.Scanner;

public class PointPosition {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three points(P(x, y): ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		
		if(leftLine(x0,y0,x1,y1,x2,y2)) {
			System.out.println("P2 is left line");
		} else if (inLine(x0,y0,x1,y1,x2,y2)) {
			System.out.println("P2 is in line");
		} else {
			System.out.println("P2 is right line");
		}
	}

	private static boolean inLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		double islem = (x1 -x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		if (islem == 0) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean leftLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		double islem = (x1 -x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		if (islem > 0) {
			return true;
		} else {
			return false;
		}
	}
}
