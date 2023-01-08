package chapter_02.exercise_05;

import java.util.Scanner;

public class FinancialCalculateTips {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Sub total and Commission rate ");
		double subTotal= input.nextDouble();
		double commissionRate = input.nextDouble();
		
		double commissionAmount = subTotal * (commissionRate / 100);
		double sum = commissionAmount + subTotal;
		
		System.out.println("Commission: " + commissionAmount + "$" + " and Sum : " + sum + "$ ");
	}
}
