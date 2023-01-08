package chapter_03.exercise_23;

import java.util.Scanner;

public class PointInRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x and y : ");
		int x = input.nextInt();
		int y = input.nextInt();
		
		if (x > 5 || y > 5) {
			System.out.println("Point (" + x + " " + y + ") in rectangle");
		}else {
			System.out.println("Point (" + x + " " + y + ") out rectangle");
		}
	
	}
}
