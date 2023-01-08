package chapter_02.exercise_13;

import java.util.Scanner;

public class CompoundValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the monthly amount of money: ");
		
		double montlyAmount = input.nextDouble();	
		float annualIntestRate = 5 / 100.0F ;
		float montlyRate = annualIntestRate / 12.0F;
		double firstMonth = montlyAmount * (1 + montlyRate);
		double secondMonth = (montlyAmount + firstMonth) * (1 + montlyRate) ;
		double thirdMonth = (montlyAmount + secondMonth) * (1 + montlyRate);
		double fourthMonth =(montlyAmount + thirdMonth) * (1 + montlyRate);
		double fifthMonth =(montlyAmount + fourthMonth) * (1 + montlyRate);
		double sixthMonth =(montlyAmount + fifthMonth) * (1 + montlyRate);
		
		System.out.println((int)(sixthMonth * 100) / 100.0);
	
		double compoundValue = montlyAmount * Math.pow(1 + annualIntestRate , 1 );
		System.out.println(compoundValue);
	}
}
