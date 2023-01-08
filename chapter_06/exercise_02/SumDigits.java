package chapter_06.exercise_02;

import java.util.Scanner;

public class SumDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers:");
		int number = input.nextInt();
		int totalStepValue = getStep(number);
		System.out.println(totalStepValue);
	}

	private static int getStep(int number) {
		int digit = number % 10;
		int remainingNumber = number / 10;
		int sum = digit;
		while (remainingNumber > 0) {
		
			digit = remainingNumber % 10;
			sum += digit;
			remainingNumber /= 10;
			number++;
		}
		return sum;
	}
}
