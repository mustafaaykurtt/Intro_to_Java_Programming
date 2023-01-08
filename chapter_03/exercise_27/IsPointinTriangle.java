package chapter_03.exercise_27;

import java.util.Scanner;

public class IsPointinTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter P(x,y)");
		double px = input.nextDouble();
		double py = input.nextDouble();

		double ax = 0;
		double ay = 0;
		double bx = 0;
		double by = 100;
		double cx = 200;
		double cy = 0;

		bx -= ax;
		by -= ay;
		cx -= ax;
		cy -= ay;
		px -= ax;
		px -= ay;

		double d = bx * cy - cx * by;

		double wa = (px * (by - cy) + py * (cx - bx) + bx * cy - cx * by) / d;
		double wb = (px * cy - py * cx) / d;
		double wc = (py * bx - px * by) / d;

		if (wa < 1 && wb < 1 && wc < 1 && wa > 0 && wb > 0 && wc > 0) {
			System.out.println("Point P is in circle.");
		} else {
			System.out.println("Pint P is out circle");
		}

	}
}
