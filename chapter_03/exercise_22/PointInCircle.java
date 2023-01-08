package chapter_03.exercise_22;

import java.util.Scanner;

public class PointInCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter x and y: ");
		int x = input.nextInt();
		int y = input.nextInt();
		int radius = 10;
		
		double distance = Math.pow(x * x + y * y, 0.5);
		
		if(distance <= radius) {
			System.out.println("Point (" + x + " " + y + ") in circle");
		}else {
			System.out.println("Point (" + x + " " + y + ") out circle.");
		}
	}
}
