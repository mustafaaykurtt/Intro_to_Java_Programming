package chapter_06.exercise_19;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the 3 sides:");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
	
	
		if(isTrue(side1 , side2 , side3 ) == true) {
			double area =getTriangleArea(side1 , side2 , side3 );
			System.out.println(area);
		} else {
			System.out.println("Wrong entry !");
		}
	}
	
	private static boolean isTrue(double side1, double side2, double side3) {
		if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
			return false;
		} else {
			return true;
		}
	}
	
	private static double getTriangleArea(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3)/2;
		double area = Math.pow(s * (s - side1) * (s- side2) * (s- side3) , 0.5);
		return area;
	}
}
