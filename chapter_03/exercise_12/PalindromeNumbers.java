package chapter_03.exercise_12;

import java.util.Scanner;

public class PalindromeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3 digit number:");
		int number = input.nextInt();

		int hundredDigits = number / 100;

		int remainFigure = number % 100;
		int tenDigits = (remainFigure / 10);

		remainFigure %= 10;
		int onesDigit = remainFigure;

		if (number > 99 && number < 1000) {
			if ((onesDigit == hundredDigits) || (hundredDigits == tenDigits && tenDigits == onesDigit)) {
				System.out.println(number + " is a palindrome.");
			} else {
				System.out.println(number + " is not a palindrome.");
			}
		}else {
			System.out.println("You entered the wrong digit");
		}
	}
}
