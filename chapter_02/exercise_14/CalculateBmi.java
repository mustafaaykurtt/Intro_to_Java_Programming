package chapter_02.exercise_14;

import java.util.Scanner;

public class CalculateBmi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your weight in pounds : ");
		float kg = input.nextFloat() * 0.45359237F ;
		System.out.println("Enter your length in inchles: ");
		float metre = input.nextFloat() *  0.0254F;
		
		float bmi = kg / (float)Math.pow(metre, 2);
		System.out.println("VKI = " + (int)(bmi * 10000) / 10000.0);
		
	}
}
