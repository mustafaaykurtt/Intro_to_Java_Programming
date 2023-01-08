package chapter_02.exercise_20;

import java.util.Scanner;

public class CalculateInterestYield {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the balance and annual interest rate : ");
		double balance = input.nextDouble();
		double montlyInterestRate = (input.nextDouble() / 1200);
		
		
		double interestYield = balance * (montlyInterestRate);
		System.out.println(interestYield);
		
	}
}
