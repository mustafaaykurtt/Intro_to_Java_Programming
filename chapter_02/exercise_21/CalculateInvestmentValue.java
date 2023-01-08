package chapter_02.exercise_21;

import java.util.Scanner;

public class CalculateInvestmentValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the investment amount, interest rate (%) , number of years:");
		double investmentAmount = input.nextDouble();
		double montlyInterestRate = (input.nextDouble() / 1200) ;
		double year = input.nextDouble();
		
		double returnValueInvestment = investmentAmount * Math.pow((1 + montlyInterestRate) , (year * 12 )) ;
		System.out.println(returnValueInvestment);
	}
}
