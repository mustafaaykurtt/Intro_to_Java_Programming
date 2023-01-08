package chapter_02.exercise_04;

import java.util.Scanner;

public class PoundToKg {
	public static void main(String[] args) {
		Scanner input  = new Scanner (System.in);
		
		System.out.println("Enter a pound: ");
		final float POUND_CONVERT_VALUE = 0.454F ;
		double pound = input.nextDouble();
		double kg = (int)(pound * POUND_CONVERT_VALUE * 1000) / 1000.0;
		
		System.out.println(pound + " pound " + kg + " kg.");
		
		
	}
}
