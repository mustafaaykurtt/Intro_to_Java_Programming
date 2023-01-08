package chapter_06.exercise_07;

import java.util.Scanner;

public class ReturnFutureInvestmentValue {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Please enter the investment amount: ");
		 double amount = input.nextDouble();
		 System.out.print("Enter the interest rate(%): ");
		 double montlyInterestRate = input.nextDouble();

		System.out.println("Year         Value");

		for (int year = 1; year < 31; year++) {

			System.out.printf(" %-10d%-12.2f\n", year, returnValueOfInvestment(amount, montlyInterestRate , year));
			
		}

	}

	private static double returnValueOfInvestment(double amount, double rate, int year) {
		return amount * Math.pow((1 + (rate / 1200)), (year * 12));

	}
}
