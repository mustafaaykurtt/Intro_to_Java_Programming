package chapter_03.exercise_19;

import java.util.Scanner;

public class PerimeterOfTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 sides of triangle");
		int k1 = input.nextInt();
		int k2 = input.nextInt();
		int k3 = input.nextInt();
		int perimeter = k1 + k2 + k3;
		
		if(k1 < (k2 + k3) && k2 < (k1 + k3) && k3 < (k2 + k1)) {
			System.out.println("Triangle is perimeter = " + perimeter);
		}else {
			System.out.println("There is an error on the sides of the triangle. Please check again..");
		}
	}
}
