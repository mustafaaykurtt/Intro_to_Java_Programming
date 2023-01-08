package chapter_06.exercise_31;

import java.util.Scanner;

public class CreditCardNumberValidation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of card:");
		String card = input.next();
		
		System.out.print("Your number of card: " + card + (isValid(card) ? " valid" : " unvalid"));
		
	}

	private static boolean isValid(String card) {
		if(card.length() < 13 && card.length() > 16) {
			return false;
		}
		
		String sumEvenNumbers = evenCard(card);		
		String sumOddNumbers = oddCard(card);	
		
		int sum = Integer.parseInt(sumEvenNumbers) + Integer.parseInt(sumOddNumbers);
		
		if(sum % 10 == 0) {
			return true;
		}
		
		return false;
	}

	private static String evenCard(String card) {
		int sumEven = 0;
		for (int i = card.length() - 2; i >= 0 ; i -= 2) {
			char ch = card.charAt(i);
			int multiplication = (ch - 48) * 2; 
			if( multiplication > 9){
				 sumEven += (multiplication % 10) +(multiplication / 10);
			 } else {
				 sumEven += multiplication;
			 }
  		}
		
		return Integer.toString(sumEven);
	}
	
	private static String oddCard(String card) {
		int sumOdd = 0;
		for (int i = card.length() - 1; i >= 0 ; i -= 2) {
			char ch = card.charAt(i);
			sumOdd += (ch - 48); 
		}
		
		return Integer.toString(sumOdd);
	}
}
