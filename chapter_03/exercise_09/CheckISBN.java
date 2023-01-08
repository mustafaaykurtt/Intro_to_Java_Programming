package chapter_03.exercise_09;

import java.util.Scanner;

public class CheckISBN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the page number from d1 to d9: ");
		int number = input.nextInt();

		int d1 = number / 100000000;
		int remainingFigures = number % 100000000;
		int d2 = remainingFigures / 10000000;

		remainingFigures %= 10000000;
		int d3 = remainingFigures / 1000000;

		remainingFigures %= 1000000;
		int d4 = remainingFigures / 100000;

		remainingFigures %= 100000;
		int d5 = remainingFigures / 10000;

		remainingFigures %= 10000;
		int d6 = remainingFigures / 1000;

		remainingFigures %= 1000;
		int d7 = remainingFigures / 100;

		remainingFigures %= 100;
		int d8 = remainingFigures / 10;

		remainingFigures %= 10;
		int d9 = remainingFigures;

		int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		if (d10 == 10) {
			System.out.println("With 10. digit ISBN " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7
					+ "" + d8 + "" + d9 + "X");
		} else {
			System.out.println("With 10. digit ISBN " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7
					+ "" + d8 + "" + d9 + "" + d10);
		}
	}
}
