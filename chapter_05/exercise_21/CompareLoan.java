package chapter_05.exercise_21;

import java.util.Scanner;

public class CompareLoan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount to be withdrawn: ");
		double drawnAmount = input.nextDouble();
		
		System.out.println("Enter year: ");
		double year = input.nextDouble();
		
		double rate = 5;
		
		System.out.println("Rate                       Montly payment             Total payment");
		for(int i = 0; rate <= 8 ; i++) {
			
			double montlyInterestRate = rate / 1200;

			double montlyPayment = (drawnAmount * montlyInterestRate)
					/ (1 - 1 / Math.pow(1 + montlyInterestRate, year * 12));

			double totalPayment = montlyPayment * 12 * year;
			
			System.out.printf("%-30.3f%-23.2f%-15.2f\n" , rate , montlyPayment , totalPayment );
			
			rate += (1 / 8.0);
		}
		
		
		
		
		
		
	}
}
