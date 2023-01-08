package chapter_02.exercise_12;

import java.util.Scanner;

public class FindingRunwayLength {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter v(m/s) and acceleration :");
		double v = input.nextDouble();
		double acceleration = input.nextDouble();
		
		double distance = Math.pow(v, 2) / (2 * acceleration);
		
		System.out.println("Minimum runway distance required for aircraft : " + ((int) (distance * 1000) / 1000.0 )) ;
		
	}
}
