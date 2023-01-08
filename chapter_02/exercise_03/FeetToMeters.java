package chapter_02.exercise_03;

import java.util.Scanner;

public class FeetToMeters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a feet: ");
		double feet = input.nextDouble();
		
		double metre = (feet * 0.305);
		System.out.println(feet + " feet " + metre + " meters.");
	}

}
