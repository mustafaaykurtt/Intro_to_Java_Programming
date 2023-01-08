package chapter_12.exercise_04;

import java.util.Scanner;

public class TestLoan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter interest rate, year and loan Amount: ");
		
		while (true) {
			double rate = input.nextDouble();
			int year = input.nextInt();
			double loanAmount = input.nextDouble();
			try {
				Loan loan = new Loan(rate, year, loanAmount);
				loan.getMontlyAmount();
				System.out.printf(
						"The loan was created on: %s\n" + "The monthly payment is %.2f\nTne total payment is %.2f\n",
						loan.getLoanDate().toString(), loan.getMontlyAmount(), loan.getTotalPayment());
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Enter interest rate, year and loan Amount: ");
			}
		}
		input.close();
	}
}
