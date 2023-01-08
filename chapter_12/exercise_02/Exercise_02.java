package chapter_12.exercise_02;

import java.util.Scanner;

public class Exercise_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two Integers: ");
		double number1 = 0;
		double number2 = 0;

		while (true) {
			try {
				number1 = input.nextDouble();
				number2 = input.nextDouble();
				break;
			} catch (Exception e) {
				System.out.println("Invalid input.." + e.getMessage());
				System.out.println("Enter two Integers");
				
				input.nextLine();
			}
		}
		System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));

	}
}
