package chapter_02.exercise_16;

import java.util.Scanner;

public class AreaOfHexagon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side length: ");
		
		double side = input.nextDouble();
		double area = (3 * Math.pow(3 , 0.5) * Math.pow(side , 2) / 2 );
		
		System.out.println("Area = " + area);
		
	}
}
