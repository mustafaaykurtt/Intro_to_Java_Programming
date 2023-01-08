package chapter_06.exercise_04;

import java.util.Scanner;

public class IntegerReversed {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter numbers:");
		String number = input.next();
		
		 int reverseNumber = getReverse(number);
		 System.out.println("You entered :" + number + " reverse " + reverseNumber);
		 
	}

	private static int getReverse(String number) {
		int length = number.length() -1;
		String tersten = "";
		
		while(length >= 0) {
			char ch = number.charAt(length);
			tersten += ch;
			
			length--;
		}
		
		return Integer.parseInt(tersten);
	}
}
